package com.android.volley;

import com.android.volley.Cache;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes16.dex */
class WaitingRequestManager implements Request.NetworkRequestCompleteListener {
    private final CacheDispatcher mCacheDispatcher;
    private final BlockingQueue<Request<?>> mNetworkQueue;
    private final ResponseDelivery mResponseDelivery;
    private final Map<String, List<Request<?>>> mWaitingRequests = new HashMap();
    private final RequestQueue mRequestQueue = null;

    WaitingRequestManager(CacheDispatcher cacheDispatcher, BlockingQueue<Request<?>> blockingQueue, ResponseDelivery responseDelivery) {
        this.mResponseDelivery = responseDelivery;
        this.mCacheDispatcher = cacheDispatcher;
        this.mNetworkQueue = blockingQueue;
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public void onResponseReceived(Request<?> request, Response<?> response) {
        List<Request<?>> listRemove;
        Cache.Entry entry = response.cacheEntry;
        if (entry == null || entry.isExpired()) {
            onNoUsableResponseReceived(request);
            return;
        }
        String cacheKey = request.getCacheKey();
        synchronized (this) {
            listRemove = this.mWaitingRequests.remove(cacheKey);
        }
        if (listRemove != null) {
            if (VolleyLog.DEBUG) {
                VolleyLog.m774v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<Request<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.mResponseDelivery.postResponse(it.next(), response);
            }
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public synchronized void onNoUsableResponseReceived(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        try {
            String cacheKey = request.getCacheKey();
            List<Request<?>> listRemove = this.mWaitingRequests.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (VolleyLog.DEBUG) {
                    VolleyLog.m774v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                Request<?> requestRemove = listRemove.remove(0);
                this.mWaitingRequests.put(cacheKey, listRemove);
                requestRemove.setNetworkRequestCompleteListener(this);
                RequestQueue requestQueue = this.mRequestQueue;
                if (requestQueue != null) {
                    requestQueue.sendRequestOverNetwork(requestRemove);
                } else if (this.mCacheDispatcher != null && (blockingQueue = this.mNetworkQueue) != null) {
                    try {
                        blockingQueue.put(requestRemove);
                    } catch (InterruptedException e) {
                        VolleyLog.m772e("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.mCacheDispatcher.quit();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized boolean maybeAddToWaitingRequests(Request<?> request) {
        try {
            String cacheKey = request.getCacheKey();
            if (this.mWaitingRequests.containsKey(cacheKey)) {
                List<Request<?>> arrayList = this.mWaitingRequests.get(cacheKey);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                request.addMarker("waiting-for-response");
                arrayList.add(request);
                this.mWaitingRequests.put(cacheKey, arrayList);
                if (VolleyLog.DEBUG) {
                    VolleyLog.m771d("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
                return true;
            }
            this.mWaitingRequests.put(cacheKey, null);
            request.setNetworkRequestCompleteListener(this);
            if (VolleyLog.DEBUG) {
                VolleyLog.m771d("new request, sending to network %s", cacheKey);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
