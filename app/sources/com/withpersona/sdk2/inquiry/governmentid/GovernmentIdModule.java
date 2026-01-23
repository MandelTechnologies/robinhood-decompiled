package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.modal.AlertContainer;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransitionContainer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdModule.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdModule;", "", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GovernmentIdModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    @JvmStatic
    public static final Set<ViewFactory<?>> provideViewBindings(GovernmentIdCameraScreenViewFactory governmentIdCameraScreenViewFactory) {
        return INSTANCE.provideViewBindings(governmentIdCameraScreenViewFactory);
    }

    /* compiled from: GovernmentIdModule.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0013\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0005H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdModule$Companion;", "", "<init>", "()V", "provideViewBindings", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "governmentIdCameraScreenViewFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdCameraScreenViewFactory;", "provideMoshiJsonAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Set<ViewFactory<?>> provideViewBindings(GovernmentIdCameraScreenViewFactory governmentIdCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return SetsKt.setOf((Object[]) new ViewFactory[]{GovernmentIdInstructionsRunner.INSTANCE, governmentIdCameraScreenViewFactory, GovernmentIdReviewRunner.INSTANCE, GovernmentIdSubmittingRunner.INSTANCE, AlertContainer.INSTANCE, ScreenWithTransitionContainer.INSTANCE, SelectCountryAndIdClassRunner.INSTANCE});
        }

        @JvmStatic
        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return SetsKt.setOf(AutoClassifyResponse.INSTANCE.createAdapter());
        }
    }
}
