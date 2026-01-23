package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.p415ui.ViewFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieModule.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieModule;", "", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Set<ViewFactory<?>> provideViewBindings(OldSelfieCameraScreenViewFactory oldSelfieCameraScreenViewFactory, SelfieCameraScreenViewFactory selfieCameraScreenViewFactory) {
        return INSTANCE.provideViewBindings(oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory);
    }

    /* compiled from: SelfieModule.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieModule$Companion;", "", "<init>", "()V", "provideViewBindings", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "oldSelfieCameraScreenViewFactory", "Lcom/withpersona/sdk2/inquiry/selfie/OldSelfieCameraScreenViewFactory;", "selfieCameraScreenViewFactory", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieCameraScreenViewFactory;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Set<ViewFactory<?>> provideViewBindings(OldSelfieCameraScreenViewFactory oldSelfieCameraScreenViewFactory, SelfieCameraScreenViewFactory selfieCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(oldSelfieCameraScreenViewFactory, "oldSelfieCameraScreenViewFactory");
            Intrinsics.checkNotNullParameter(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return SetsKt.setOf((Object[]) new ViewFactory[]{SelfieInstructionsRunner.INSTANCE, oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory, SelfieSubmittingRunner.INSTANCE, SelfieRestartCameraRunner.INSTANCE, SelfieReviewCapturesRunner.INSTANCE});
        }
    }
}
