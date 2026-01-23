package com.robinhood.android.supportchat.thread;

import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mediaservice.CameraUtils;
import com.robinhood.android.mediaservice.ImagePicker;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/supportchat/thread/CxChatFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "cameraUtils", "Lcom/robinhood/android/mediaservice/CameraUtils;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CxChatFragment_MembersInjector implements MembersInjector<CxChatFragment> {
    private final Provider<CameraUtils> cameraUtils;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<ImagePicker> imagePicker;
    private final Provider<NotificationManager> notificationManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CxChatFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<ImagePicker> provider3, Provider<CameraUtils> provider4, Provider<NotificationManager> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCameraUtils(CxChatFragment cxChatFragment, CameraUtils cameraUtils) {
        INSTANCE.injectCameraUtils(cxChatFragment, cameraUtils);
    }

    @JvmStatic
    public static final void injectImagePicker(CxChatFragment cxChatFragment, ImagePicker imagePicker) {
        INSTANCE.injectImagePicker(cxChatFragment, imagePicker);
    }

    @JvmStatic
    public static final void injectNotificationManager(CxChatFragment cxChatFragment, NotificationManager notificationManager) {
        INSTANCE.injectNotificationManager(cxChatFragment, notificationManager);
    }

    public CxChatFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<ImagePicker> imagePicker, Provider<CameraUtils> cameraUtils, Provider<NotificationManager> notificationManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
        Intrinsics.checkNotNullParameter(cameraUtils, "cameraUtils");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.imagePicker = imagePicker;
        this.cameraUtils = cameraUtils;
        this.notificationManager = notificationManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CxChatFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        ImagePicker imagePicker = this.imagePicker.get();
        Intrinsics.checkNotNullExpressionValue(imagePicker, "get(...)");
        companion3.injectImagePicker(instance, imagePicker);
        CameraUtils cameraUtils = this.cameraUtils.get();
        Intrinsics.checkNotNullExpressionValue(cameraUtils, "get(...)");
        companion3.injectCameraUtils(instance, cameraUtils);
        NotificationManager notificationManager = this.notificationManager.get();
        Intrinsics.checkNotNullExpressionValue(notificationManager, "get(...)");
        companion3.injectNotificationManager(instance, notificationManager);
    }

    /* compiled from: CxChatFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/supportchat/thread/CxChatFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "imagePicker", "Lcom/robinhood/android/mediaservice/ImagePicker;", "cameraUtils", "Lcom/robinhood/android/mediaservice/CameraUtils;", "notificationManager", "Lcom/robinhood/android/common/notification/NotificationManager;", "injectImagePicker", "", "instance", "injectCameraUtils", "injectNotificationManager", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CxChatFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<ImagePicker> imagePicker, Provider<CameraUtils> cameraUtils, Provider<NotificationManager> notificationManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
            Intrinsics.checkNotNullParameter(cameraUtils, "cameraUtils");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            return new CxChatFragment_MembersInjector(singletons, genericComposeSingletons, imagePicker, cameraUtils, notificationManager);
        }

        @JvmStatic
        public final void injectImagePicker(CxChatFragment instance, ImagePicker imagePicker) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(imagePicker, "imagePicker");
            instance.setImagePicker(imagePicker);
        }

        @JvmStatic
        public final void injectCameraUtils(CxChatFragment instance, CameraUtils cameraUtils) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cameraUtils, "cameraUtils");
            instance.setCameraUtils(cameraUtils);
        }

        @JvmStatic
        public final void injectNotificationManager(CxChatFragment instance, NotificationManager notificationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            instance.setNotificationManager(notificationManager);
        }
    }
}
