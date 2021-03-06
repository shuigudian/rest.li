/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package test.r2.perf;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import test.r2.perf.Generator;


public class StringGenerator implements Generator<String>
{
  private final String _msg;

  public StringGenerator(int msgSize)
  {
    char[] msg = new char[msgSize];
    Arrays.fill(msg, 'a');
    _msg = new String(msg);
  }

  @Override
  public String nextMessage()
  {
    return _msg;
  }
}