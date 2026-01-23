package com.withpersona.sdk2.inquiry.p424ui.network;

import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OneTimeLinkCodeForPersonasRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0004\b\t\n\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Meta;)V", "getMeta", "()Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Meta;", "Meta", "TransitionParams", "NamedComponentParam", "Companion", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OneTimeLinkCodeForPersonasRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Meta meta;

    public OneTimeLinkCodeForPersonasRequest(Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: OneTimeLinkCodeForPersonasRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Meta;", "", "transitionParams", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$TransitionParams;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$TransitionParams;)V", "getTransitionParams", "()Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$TransitionParams;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Meta {
        private final TransitionParams transitionParams;

        public Meta(TransitionParams transitionParams) {
            Intrinsics.checkNotNullParameter(transitionParams, "transitionParams");
            this.transitionParams = transitionParams;
        }

        public final TransitionParams getTransitionParams() {
            return this.transitionParams;
        }
    }

    /* compiled from: OneTimeLinkCodeForPersonasRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$TransitionParams;", "", "componentData", "", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$NamedComponentParam;", "<init>", "(Ljava/util/List;)V", "getComponentData", "()Ljava/util/List;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class TransitionParams {
        private final List<NamedComponentParam> componentData;

        public TransitionParams(List<NamedComponentParam> list) {
            this.componentData = list;
        }

        public final List<NamedComponentParam> getComponentData() {
            return this.componentData;
        }
    }

    /* compiled from: OneTimeLinkCodeForPersonasRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$NamedComponentParam;", "", "", "name", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "value", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "getValue", "()Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class NamedComponentParam {
        private final String name;
        private final ComponentParam value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NamedComponentParam)) {
                return false;
            }
            NamedComponentParam namedComponentParam = (NamedComponentParam) other;
            return Intrinsics.areEqual(this.name, namedComponentParam.name) && Intrinsics.areEqual(this.value, namedComponentParam.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "NamedComponentParam(name=" + this.name + ", value=" + this.value + ")";
        }

        public NamedComponentParam(String name, ComponentParam value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        public final String getName() {
            return this.name;
        }

        public final ComponentParam getValue() {
            return this.value;
        }
    }

    /* compiled from: OneTimeLinkCodeForPersonasRequest.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "componentParams", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OneTimeLinkCodeForPersonasRequest create(Map<String, ? extends ComponentParam> componentParams) {
            Intrinsics.checkNotNullParameter(componentParams, "componentParams");
            ArrayList arrayList = new ArrayList(componentParams.size());
            for (Map.Entry<String, ? extends ComponentParam> entry : componentParams.entrySet()) {
                arrayList.add(new NamedComponentParam(entry.getKey(), entry.getValue()));
            }
            return new OneTimeLinkCodeForPersonasRequest(new Meta(new TransitionParams(arrayList)));
        }
    }
}
