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
package sailfish.remoting.channel2;

import java.util.Iterator;

import sailfish.remoting.Endpoint;
import sailfish.remoting.RequestControl;
import sailfish.remoting.ResponseCallback;
import sailfish.remoting.exceptions.SailfishException;
import sailfish.remoting.future.ResponseFuture;

/**
 * 
 * The {@link ExchangeChannelGroup} is responsible for providing the {@link ExchangeChannel}'s to use
 * via its {@link #next()} method. 
 * 
 * @author spccold
 * @version $Id: ExchangeChannelGroup.java, v 0.1 2016年11月21日 下午2:18:34 spccold
 *          Exp $
 */
public interface ExchangeChannelGroup extends Endpoint, Iterable<ExchangeChannel>{
    /**
     * Returns one of the {@link ExchangeChannel}s managed by this {@link ExchangeChannelGroup}.
     */
    ExchangeChannel next();

    @Override
    Iterator<ExchangeChannel> iterator();
    
    boolean isAvailable();
    
    /**
     * one-way pattern
     */
    void oneway(byte[] data, RequestControl requestControl) throws SailfishException;
    
    /**
     * request–response pattern
     */
    ResponseFuture<byte[]> request(byte[] data, RequestControl requestControl) throws SailfishException;
    
    /**
     * callback request via request–response pattern
     */
    void request(byte[] data, ResponseCallback<byte[]> callback, RequestControl requestControl) throws SailfishException;
}
