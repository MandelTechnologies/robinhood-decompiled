package com.withpersona.sdk2.inquiry.internal.network;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionBackRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0002\b\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V", "getMeta", "()Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "Meta", "Companion", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TransitionBackRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Meta meta;

    public TransitionBackRequest(Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: TransitionBackRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "", "fromStep", "", "<init>", "(Ljava/lang/String;)V", "getFromStep", "()Ljava/lang/String;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final String fromStep;

        public Meta(String fromStep) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromStep = fromStep;
        }

        public final String getFromStep() {
            return this.fromStep;
        }
    }

    /* compiled from: TransitionBackRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "fromStep", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransitionBackRequest create(String fromStep) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new TransitionBackRequest(new Meta(fromStep));
        }
    }
}
