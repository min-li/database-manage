/*
 * Copyright 2021 Minli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.minli.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Minli
 */
public class LanguageUtil {

    public static final ResourceBundle resourceBundle;

    static {
        if (Locale.CHINA.equals(Locale.getDefault())) {
            resourceBundle = ResourceBundle.getBundle("language.database-manage", Locale.CHINA);
        } else {
            resourceBundle = ResourceBundle.getBundle("language.database-manage", Locale.ENGLISH);
        }
    }

    public static String getValue(String key) {
        return resourceBundle.getString(key);
    }

}
