package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NetworkInquiryModule.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule;", "", "<init>", "()V", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NetworkInquiryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    /* compiled from: NetworkInquiryModule.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule$Companion;", "", "<init>", "()V", "provideMoshiJsonAdapterFactory", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return SetsKt.setOf((Object[]) new JsonAdapter.Factory[]{NextStep.INSTANCE.createAdapter(), UiComponentConfig.INSTANCE.createAdapter(), LocalImage.INSTANCE.createAdapter(), Id.INSTANCE.createAdapter(), Included.INSTANCE.createAdapter()});
        }
    }
}
