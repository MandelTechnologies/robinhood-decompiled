package com.robinhood.android.brokeragecontent;

import kotlin.Metadata;

/* compiled from: BrokerageResource.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "R", "", "contentfulId", "", "getContentfulId", "()Ljava/lang/String;", "ukContentfulId", "getUkContentfulId", "sgContentfulId", "getSgContentfulId", "lib-brokerage-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BrokerageResource<R> {

    /* compiled from: BrokerageResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <R> String getSgContentfulId(BrokerageResource<? extends R> brokerageResource) {
            return null;
        }
    }

    String getContentfulId();

    String getSgContentfulId();

    String getUkContentfulId();
}
