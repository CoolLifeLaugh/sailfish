/**
 *
 *	Copyright 2016-2016 spccold
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   	http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 */
package sailfish.remoting.channel;

/**
 * 
 * @author spccold
 * @version $Id: ChannelGroupMode.java, v 0.1 2016年10月27日 上午11:09:58 jileng Exp $
 */
public enum ChannelGroupMode {
	/** with only one eager or lazy connection*/
    simple,
    /** with multiple simple exchange channel*/
    multiconns,
    /** with multiple simple exchange channel, but support read write splitting */
    readwrite,
    ;
}
