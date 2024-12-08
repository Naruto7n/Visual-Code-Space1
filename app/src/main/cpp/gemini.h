
#ifndef VCSPACE_GEMINI_H
#define VCSPACE_GEMINI_H

#include <cstdint>
#include <string>

namespace AI {
  const uint8_t gemini_api_key[] = {0xaf, 0x9b, 0xd2, 0x12, 0x26, 0x82, 0xd2, 0x46, 0xb5, 0x75, 0x69, 0x76, 0x14, 0xed, 0x10, 0xd0, 0x6e, 0x6d, 0x0c, 0x4d, 0xe6, 0x1a, 0xec, 0x54, 0xb1, 0x2a, 0xe5, 0xa5, 0xb5, 0x6e, 0x01, 0x0b, 0x6c, 0x35, 0xf1, 0xbf, 0x2c, 0x15, 0x3e, 0x3a, 0xb9, 0xd3, 0xaa, 0x81, 0x5b, 0xdb, 0x97, 0x79};
  const uint8_t encryption_key[] = {0x79, 0x04, 0x9a, 0x7c, 0xe4, 0xa5, 0x91, 0x62, 0x46, 0x49, 0x07, 0xf0, 0xf4, 0x11, 0x73, 0xca};
  const uint8_t iv[] = {0xd0, 0xaa, 0x1d, 0x94, 0xf2, 0x21, 0xc5, 0xba, 0xcd, 0xd4, 0x78, 0x17, 0x7d, 0x55, 0x63, 0xdd};

  class gemini {
  public:
    static std::string getApiKey();
  };

}// namespace AI

#endif//VCSPACE_GEMINI_H
