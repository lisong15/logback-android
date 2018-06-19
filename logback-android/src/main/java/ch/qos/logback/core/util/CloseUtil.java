/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2013, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Static utility method for {@link Closeable} objects.
 *
 * @author Carl Harris
 */
public class CloseUtil {

  /**
   * Closes a closeable while suppressing any {@code IOException} that occurs.
   * @param closeable the closeable to close
   */
  public static void closeQuietly(Closeable closeable) {
    if (closeable == null) return;
    try {
      closeable.close();
    }
    catch (IOException ex) {
      assert true;  // avoid an empty catch
    }
  }
}
