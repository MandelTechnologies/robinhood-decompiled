package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.Metadata;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams;", "", "Offline", "Fallback", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams$Fallback;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams$Offline;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface ApiControllerParams {

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams$Offline;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams;", "staticTemplateResourceId", "", "<init>", "(I)V", "getStaticTemplateResourceId", "()I", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Offline implements ApiControllerParams {
        private final int staticTemplateResourceId;

        public Offline(int i) {
            this.staticTemplateResourceId = i;
        }

        public final int getStaticTemplateResourceId() {
            return this.staticTemplateResourceId;
        }
    }

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams$Fallback;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiControllerParams;", "<init>", "()V", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Fallback implements ApiControllerParams {
        public static final Fallback INSTANCE = new Fallback();

        private Fallback() {
        }
    }
}
