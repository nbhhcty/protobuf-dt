/*
 * Copyright (c) 2011 Google Inc.
 *
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.google.eclipse.protobuf.util;

import static java.lang.Character.toLowerCase;

/**
 * Utility methods related to {@code String}.
 *
 * @author alruiz@google.com (Alex Ruiz)
 */
public class Strings {

  /** Pattern to split CSVs. */
  public static final String CSV_PATTERN = "[\\s]*,[\\s]*";

  /**
   * Returns a {@code String} with the same content as the given one, but with the first character in lower case.
   * @param s the original {@code String}
   * @return a {@code String} with the same content as the given one, but with the first character in lower case.
   */
  public static String firstCharToLowerCase(String s) {
    if (s == null) return null;
    if (s.length() == 0) return s;
    char[] chars = s.toCharArray();
    chars[0] = toLowerCase(chars[0]);
    return new String(chars);
  }

  private Strings() {}
}