/*
 * This file is part of Visual Code Space.
 *
 * Visual Code Space is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Visual Code Space is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Visual Code Space.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.vcspace.plugins

import android.content.Context
import android.util.Log
import com.vcspace.plugins.command.EditorCommand
import com.vcspace.plugins.editor.Position
import com.vcspace.plugins.menu.MenuAction
import com.vcspace.plugins.menu.MenuItem
import java.io.File

/**
 * Provides the context for interacting with the application while developing a plugin.
 */
interface PluginContext {
  companion object {
    private const val TAG = "PluginContext"
  }

  /**
   * Gets the application context.
   *
   * @return the application context.
   */
  val appContext: Context

  /**
   * Gets the editor instance for file and cursor manipulation.
   *
   * @return the editor instance.
   */
  val editor: Editor

  /**
   * Registers a custom editor command in command palette.
   *
   * @param command the editor command to register.
   */
  fun registerCommand(command: EditorCommand)

  /**
   * Adds a menu item to the application's menu system.
   *
   * @param menuItem the menu item to add.
   */
  fun addMenu(menuItem: MenuItem)

  /**
   * Opens a specified file in the editor.
   *
   * @param file the file to open.
   */
  fun openFile(file: File)

  /**
   * Sets the cursor position in the editor.
   *
   * @param position the new cursor position.
   */
  fun setCursorPosition(position: Position) {
    editor.cursorPosition = position
  }

  /**
   * Opens a specified file using a file path.
   *
   * @param filePath the file path of the file to open.
   */
  fun openFile(filePath: String) {
    openFile(File(filePath))
  }

  /**
   * Adds a menu item to the application's menu system with a title, ID, and action.
   *
   * @param title  the title of the menu item.
   * @param id     the unique identifier for the menu item.
   * @param action the action to execute when the menu item is selected.
   */
  fun addMenu(title: String, id: Int, action: MenuAction) {
    addMenu(MenuItem(title, id = id, action = action))
  }

  /**
   * Logs a message to the console for debugging purposes.
   *
   * @param message the message to log.
   */
  fun log(message: String) {
    Log.i(TAG, message)
  }
}
