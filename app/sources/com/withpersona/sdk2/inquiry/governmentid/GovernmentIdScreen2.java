package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import coil.ImageLoader;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "", "<init>", "()V", "InstructionsScreen", "CameraScreen", "Overlay", "ReviewScreen", "SubmittingScreen", "AutoClassificationSelectCountryAndIdClassScreen", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$InstructionsScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$SubmittingScreen;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen, reason: use source file name */
/* loaded from: classes18.dex */
public abstract class GovernmentIdScreen2 {
    public /* synthetic */ GovernmentIdScreen2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GovernmentIdScreen2() {
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010,R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.¨\u00062"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$InstructionsScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "title", "", "prompt", "chooseText", "disclaimer", "enabledIdClasses", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "selectIdClass", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "isEnabled", "", "onBack", "Lkotlin/Function0;", "onCancel", "error", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getPrompt", "getChooseText", "getDisclaimer", "getEnabledIdClasses", "()Ljava/util/List;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getSelectIdClass", "()Lkotlin/jvm/functions/Function1;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "()Z", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getError", "getOnErrorDismissed", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$InstructionsScreen */
    public static final class InstructionsScreen extends GovernmentIdScreen2 {
        private final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;
        private final String chooseText;
        private final String disclaimer;
        private final List<EnabledIdClass> enabledIdClasses;
        private final String error;
        private final boolean isEnabled;
        private final NavigationState navigationState;
        private final Function0<Unit> onBack;
        private final Function0<Unit> onCancel;
        private final Function0<Unit> onErrorDismissed;
        private final String prompt;
        private final Function1<IdConfig, Unit> selectIdClass;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final String title;

        public final String getTitle() {
            return this.title;
        }

        public final String getPrompt() {
            return this.prompt;
        }

        public final String getChooseText() {
            return this.chooseText;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final List<EnabledIdClass> getEnabledIdClasses() {
            return this.enabledIdClasses;
        }

        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        public final Function1<IdConfig, Unit> getSelectIdClass() {
            return this.selectIdClass;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final NextStep.GovernmentId.AssetConfig.SelectPage getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final Function0<Unit> getOnBack() {
            return this.onBack;
        }

        public final Function0<Unit> getOnCancel() {
            return this.onCancel;
        }

        public final String getError() {
            return this.error;
        }

        public final Function0<Unit> getOnErrorDismissed() {
            return this.onErrorDismissed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InstructionsScreen(String title, String prompt, String chooseText, String disclaimer, List<EnabledIdClass> enabledIdClasses, NavigationState navigationState, Function1<? super IdConfig, Unit> selectIdClass, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z, Function0<Unit> onBack, Function0<Unit> onCancel, String str, Function0<Unit> onErrorDismissed) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(chooseText, "chooseText");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(enabledIdClasses, "enabledIdClasses");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(selectIdClass, "selectIdClass");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            this.title = title;
            this.prompt = prompt;
            this.chooseText = chooseText;
            this.disclaimer = disclaimer;
            this.enabledIdClasses = enabledIdClasses;
            this.navigationState = navigationState;
            this.selectIdClass = selectIdClass;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
        }
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\u0018\u00002\u00020\u0001:\u0001zBÇ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012 \b\u0002\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012 \b\u0002\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$\u0012\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$j\u0002`'\u0012\u0006\u0010(\u001a\u00020\u001f\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\b\b\u0002\u0010-\u001a\u00020\u0019\u0012\u001a\b\u0002\u0010.\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\b\b\u0002\u00100\u001a\u00020\u0019\u0012\b\b\u0002\u00101\u001a\u000202\u0012\b\b\u0002\u00103\u001a\u00020\u0019\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u0019\u0012\u0006\u0010<\u001a\u00020\u0019\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@¢\u0006\u0004\bA\u0010BR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR)\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\bU\u0010TR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R)\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\b\n\u0000\u001a\u0004\b`\u0010RR\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR!\u0010&\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00140$j\u0002`'¢\u0006\b\n\u0000\u001a\u0004\bc\u0010bR\u0011\u0010(\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bd\u0010]R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\be\u0010TR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\bf\u0010TR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010-\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bi\u0010WR#\u0010.\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0011¢\u0006\b\n\u0000\u001a\u0004\bj\u0010RR\u0011\u00100\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bk\u0010WR\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u00103\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bn\u0010WR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010DR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0011\u0010;\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010WR\u0011\u0010<\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010WR\u0011\u0010=\u001a\u00020>¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u0010?\u001a\u00020@¢\u0006\b\n\u0000\u001a\u0004\bx\u0010y¨\u0006{"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "title", "", "message", "disclaimer", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "captureSide", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "manuallyCapture", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "close", "Lkotlin/Function0;", TestTags.BACK, "autoCapturing", "", "autoCaptureRules", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "state", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "autoCaptureRulesId", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "autoCapture", "onCaptureError", "Lkotlin/Function1;", "", "onCameraError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "remainingCaptureCount", "manualCaptureClicked", "checkPermissions", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "finalizeLocalVideo", "onLocalVideoFinalized", "Ljava/io/File;", "enableAnalyzer", "maxRecordingLengthMs", "", "showFinalizeUi", "hintText", "captureTips", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "isEnabled", "isAudioRequired", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;ZLkotlin/jvm/functions/Function2;ZJZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDisclaimer", "getCaptureButtonState", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "getIdClass", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getCaptureSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getManuallyCapture", "()Lkotlin/jvm/functions/Function2;", "getClose", "()Lkotlin/jvm/functions/Function0;", "getBack", "getAutoCapturing", "()Z", "getAutoCaptureRules", "()Ljava/util/List;", "getState", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "getAutoCaptureRulesId", "()I", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getAutoCapture", "getOnCaptureError", "()Lkotlin/jvm/functions/Function1;", "getOnCameraError", "getRemainingCaptureCount", "getManualCaptureClicked", "getCheckPermissions", "getVideoCaptureMethod", "()Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "getFinalizeLocalVideo", "getOnLocalVideoFinalized", "getEnableAnalyzer", "getMaxRecordingLengthMs", "()J", "getShowFinalizeUi", "getHintText", "getCaptureTips", "()Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "getWebRtcManager", "()Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "getCameraXControllerFactory", "()Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "getCamera2ManagerFactoryFactory", "()Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "ManualCapture", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$CameraScreen */
    public static final class CameraScreen extends GovernmentIdScreen2 {
        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;
        private final Function2<List<String>, CameraProperties, Unit> autoCapture;
        private final List<AutoCaptureRule> autoCaptureRules;
        private final int autoCaptureRulesId;
        private final boolean autoCapturing;
        private final Function0<Unit> back;
        private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
        private final CameraXController.Factory cameraXControllerFactory;
        private final ManualCapture captureButtonState;
        private final IdConfig.Side captureSide;
        private final CaptureTipsViewModel captureTips;
        private final Function0<Unit> checkPermissions;
        private final Function0<Unit> close;
        private final String disclaimer;
        private final boolean enableAnalyzer;
        private final boolean finalizeLocalVideo;
        private final String hintText;
        private final IdClass idClass;
        private final boolean isAudioRequired;
        private final boolean isEnabled;
        private final Function0<Unit> manualCaptureClicked;
        private final Function2<List<String>, CameraProperties, Unit> manuallyCapture;
        private final long maxRecordingLengthMs;
        private final String message;
        private final NavigationState navigationState;
        private final Function1<Throwable, Unit> onCameraError;
        private final Function1<Throwable, Unit> onCaptureError;
        private final Function2<File, CameraProperties, Unit> onLocalVideoFinalized;
        private final Overlay overlay;
        private final int remainingCaptureCount;
        private final boolean showFinalizeUi;
        private final GovernmentIdState state;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final String title;
        private final VideoCaptureMethod videoCaptureMethod;
        private final WebRtcManagerBridge webRtcManager;

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final ManualCapture getCaptureButtonState() {
            return this.captureButtonState;
        }

        public final Overlay getOverlay() {
            return this.overlay;
        }

        public final IdClass getIdClass() {
            return this.idClass;
        }

        public final IdConfig.Side getCaptureSide() {
            return this.captureSide;
        }

        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        public final Function2<List<String>, CameraProperties, Unit> getManuallyCapture() {
            return this.manuallyCapture;
        }

        public final Function0<Unit> getClose() {
            return this.close;
        }

        public final Function0<Unit> getBack() {
            return this.back;
        }

        public final boolean getAutoCapturing() {
            return this.autoCapturing;
        }

        public final List<AutoCaptureRule> getAutoCaptureRules() {
            return this.autoCaptureRules;
        }

        public final GovernmentIdState getState() {
            return this.state;
        }

        public final int getAutoCaptureRulesId() {
            return this.autoCaptureRulesId;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final Function2<List<String>, CameraProperties, Unit> getAutoCapture() {
            return this.autoCapture;
        }

        public final Function1<Throwable, Unit> getOnCaptureError() {
            return this.onCaptureError;
        }

        public final Function1<Throwable, Unit> getOnCameraError() {
            return this.onCameraError;
        }

        public final int getRemainingCaptureCount() {
            return this.remainingCaptureCount;
        }

        public final Function0<Unit> getManualCaptureClicked() {
            return this.manualCaptureClicked;
        }

        public final Function0<Unit> getCheckPermissions() {
            return this.checkPermissions;
        }

        public final VideoCaptureMethod getVideoCaptureMethod() {
            return this.videoCaptureMethod;
        }

        public final boolean getFinalizeLocalVideo() {
            return this.finalizeLocalVideo;
        }

        public final Function2<File, CameraProperties, Unit> getOnLocalVideoFinalized() {
            return this.onLocalVideoFinalized;
        }

        public final boolean getEnableAnalyzer() {
            return this.enableAnalyzer;
        }

        public final long getMaxRecordingLengthMs() {
            return this.maxRecordingLengthMs;
        }

        public final boolean getShowFinalizeUi() {
            return this.showFinalizeUi;
        }

        public final String getHintText() {
            return this.hintText;
        }

        public final CaptureTipsViewModel getCaptureTips() {
            return this.captureTips;
        }

        public final WebRtcManagerBridge getWebRtcManager() {
            return this.webRtcManager;
        }

        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isAudioRequired, reason: from getter */
        public final boolean getIsAudioRequired() {
            return this.isAudioRequired;
        }

        public final CameraXController.Factory getCameraXControllerFactory() {
            return this.cameraXControllerFactory;
        }

        public final Camera2ManagerFactory.Factory getCamera2ManagerFactoryFactory() {
            return this.camera2ManagerFactoryFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CameraScreen(String title, String message, String disclaimer, ManualCapture captureButtonState, Overlay overlay, IdClass idClass, IdConfig.Side captureSide, NavigationState navigationState, Function2<? super List<String>, ? super CameraProperties, Unit> manuallyCapture, Function0<Unit> close, Function0<Unit> back, boolean z, List<? extends AutoCaptureRule> autoCaptureRules, GovernmentIdState state, int i, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Function2<? super List<String>, ? super CameraProperties, Unit> autoCapture, Function1<? super Throwable, Unit> onCaptureError, Function1<? super Throwable, Unit> onCameraError, int i2, Function0<Unit> manualCaptureClicked, Function0<Unit> checkPermissions, VideoCaptureMethod videoCaptureMethod, boolean z2, Function2<? super File, ? super CameraProperties, Unit> onLocalVideoFinalized, boolean z3, long j, boolean z4, String str, CaptureTipsViewModel captureTipsViewModel, WebRtcManagerBridge webRtcManagerBridge, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z5, boolean z6, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(manuallyCapture, "manuallyCapture");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(back, "back");
            Intrinsics.checkNotNullParameter(autoCaptureRules, "autoCaptureRules");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(autoCapture, "autoCapture");
            Intrinsics.checkNotNullParameter(onCaptureError, "onCaptureError");
            Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
            Intrinsics.checkNotNullParameter(manualCaptureClicked, "manualCaptureClicked");
            Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
            Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
            Intrinsics.checkNotNullParameter(onLocalVideoFinalized, "onLocalVideoFinalized");
            Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
            Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
            this.title = title;
            this.message = message;
            this.disclaimer = disclaimer;
            this.captureButtonState = captureButtonState;
            this.overlay = overlay;
            this.idClass = idClass;
            this.captureSide = captureSide;
            this.navigationState = navigationState;
            this.manuallyCapture = manuallyCapture;
            this.close = close;
            this.back = back;
            this.autoCapturing = z;
            this.autoCaptureRules = autoCaptureRules;
            this.state = state;
            this.autoCaptureRulesId = i;
            this.styles = governmentIdStepStyle;
            this.autoCapture = autoCapture;
            this.onCaptureError = onCaptureError;
            this.onCameraError = onCameraError;
            this.remainingCaptureCount = i2;
            this.manualCaptureClicked = manualCaptureClicked;
            this.checkPermissions = checkPermissions;
            this.videoCaptureMethod = videoCaptureMethod;
            this.finalizeLocalVideo = z2;
            this.onLocalVideoFinalized = onLocalVideoFinalized;
            this.enableAnalyzer = z3;
            this.maxRecordingLengthMs = j;
            this.showFinalizeUi = z4;
            this.hintText = str;
            this.captureTips = captureTipsViewModel;
            this.webRtcManager = webRtcManagerBridge;
            this.assetConfig = capturePage;
            this.isEnabled = z5;
            this.isAudioRequired = z6;
            this.cameraXControllerFactory = cameraXControllerFactory;
            this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "", "<init>", "(Ljava/lang/String;I)V", "Disabled", "Enabled", "Hidden", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$CameraScreen$ManualCapture */
        public static final class ManualCapture {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ManualCapture[] $VALUES;
            public static final ManualCapture Disabled = new ManualCapture("Disabled", 0);
            public static final ManualCapture Enabled = new ManualCapture("Enabled", 1);
            public static final ManualCapture Hidden = new ManualCapture("Hidden", 2);

            private static final /* synthetic */ ManualCapture[] $values() {
                return new ManualCapture[]{Disabled, Enabled, Hidden};
            }

            public static EnumEntries<ManualCapture> getEntries() {
                return $ENTRIES;
            }

            private ManualCapture(String str, int i) {
            }

            static {
                ManualCapture[] manualCaptureArr$values = $values();
                $VALUES = manualCaptureArr$values;
                $ENTRIES = EnumEntries2.enumEntries(manualCaptureArr$values);
            }

            public static ManualCapture valueOf(String str) {
                return (ManualCapture) Enum.valueOf(ManualCapture.class, str);
            }

            public static ManualCapture[] values() {
                return (ManualCapture[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Landroid/os/Parcelable;", "<init>", "()V", "Rectangle", "Passport", "Barcode", "CornersOnly", "GenericFront", "Custom", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay */
    public static abstract class Overlay implements Parcelable {
        public /* synthetic */ Overlay(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Overlay() {
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Rectangle */
        public static final /* data */ class Rectangle extends Overlay {
            public static final Rectangle INSTANCE = new Rectangle();
            public static final Parcelable.Creator<Rectangle> CREATOR = new Creator();

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Rectangle$Creator */
            public static final class Creator implements Parcelable.Creator<Rectangle> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rectangle createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Rectangle.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rectangle[] newArray(int i) {
                    return new Rectangle[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Rectangle);
            }

            public int hashCode() {
                return 319154889;
            }

            public String toString() {
                return "Rectangle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Rectangle() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Passport */
        public static final /* data */ class Passport extends Overlay {
            public static final Passport INSTANCE = new Passport();
            public static final Parcelable.Creator<Passport> CREATOR = new Creator();

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Passport$Creator */
            public static final class Creator implements Parcelable.Creator<Passport> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Passport createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Passport.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Passport[] newArray(int i) {
                    return new Passport[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Passport);
            }

            public int hashCode() {
                return -1995687048;
            }

            public String toString() {
                return "Passport";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Passport() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Barcode */
        public static final /* data */ class Barcode extends Overlay {
            public static final Barcode INSTANCE = new Barcode();
            public static final Parcelable.Creator<Barcode> CREATOR = new Creator();

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Barcode$Creator */
            public static final class Creator implements Parcelable.Creator<Barcode> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Barcode createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Barcode.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Barcode[] newArray(int i) {
                    return new Barcode[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Barcode);
            }

            public int hashCode() {
                return 1779545178;
            }

            public String toString() {
                return "Barcode";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Barcode() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$CornersOnly */
        public static final /* data */ class CornersOnly extends Overlay {
            public static final CornersOnly INSTANCE = new CornersOnly();
            public static final Parcelable.Creator<CornersOnly> CREATOR = new Creator();

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$CornersOnly$Creator */
            public static final class Creator implements Parcelable.Creator<CornersOnly> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CornersOnly createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CornersOnly.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CornersOnly[] newArray(int i) {
                    return new CornersOnly[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CornersOnly);
            }

            public int hashCode() {
                return 1450323044;
            }

            public String toString() {
                return "CornersOnly";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CornersOnly() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$GenericFront */
        public static final /* data */ class GenericFront extends Overlay {
            public static final GenericFront INSTANCE = new GenericFront();
            public static final Parcelable.Creator<GenericFront> CREATOR = new Creator();

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$GenericFront$Creator */
            public static final class Creator implements Parcelable.Creator<GenericFront> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericFront createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GenericFront.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericFront[] newArray(int i) {
                    return new GenericFront[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof GenericFront);
            }

            public int hashCode() {
                return 212467448;
            }

            public String toString() {
                return "GenericFront";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private GenericFront() {
                super(null);
            }
        }

        /* compiled from: GovernmentIdScreen.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "customImage", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "getCustomImage", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;", "getConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Custom */
        public static final class Custom extends Overlay {
            public static final Parcelable.Creator<Custom> CREATOR = new Creator();
            private final RemoteImage config;
            private final RemoteImageComponent customImage;

            /* compiled from: GovernmentIdScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay$Custom$Creator */
            public static final class Creator implements Parcelable.Creator<Custom> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Custom createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((RemoteImageComponent) parcel.readParcelable(Custom.class.getClassLoader()), (RemoteImage) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Custom[] newArray(int i) {
                    return new Custom[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.customImage, flags);
                dest.writeParcelable(this.config, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(RemoteImageComponent customImage, RemoteImage config) {
                super(null);
                Intrinsics.checkNotNullParameter(customImage, "customImage");
                Intrinsics.checkNotNullParameter(config, "config");
                this.customImage = customImage;
                this.config = config;
            }

            public final RemoteImage getConfig() {
                return this.config;
            }

            public final RemoteImageComponent getCustomImage() {
                return this.customImage;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Custom(RemoteImage config) {
                this(new RemoteImageComponent(config), config);
                Intrinsics.checkNotNullParameter(config, "config");
            }
        }
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010@R\u0011\u0010 \u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010@R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006C"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "imageLoader", "Lcoil/ImageLoader;", "message", "", "disclaimer", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "imagePath", "captureSide", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "acceptImage", "Lkotlin/Function0;", "", "acceptText", "retryImage", "retryText", "confirmCaptureTitle", "close", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "error", "onErrorDismissed", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "isEnabled", "", "isAutoClassifying", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "<init>", "(Lcoil/ImageLoader;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;)V", "getImageLoader", "()Lcoil/ImageLoader;", "getMessage", "()Ljava/lang/String;", "getDisclaimer", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "getImagePath", "getCaptureSide", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getIdClass", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getAcceptImage", "()Lkotlin/jvm/functions/Function0;", "getAcceptText", "getRetryImage", "getRetryText", "getConfirmCaptureTitle", "getClose", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getError", "getOnErrorDismissed", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Z", "getReviewCaptureButtonsAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$ReviewScreen */
    public static final class ReviewScreen extends GovernmentIdScreen2 {
        private final Function0<Unit> acceptImage;
        private final String acceptText;
        private final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;
        private final IdConfig.Side captureSide;
        private final Function0<Unit> close;
        private final String confirmCaptureTitle;
        private final String disclaimer;
        private final String error;
        private final IdClass idClass;
        private final ImageLoader imageLoader;
        private final String imagePath;
        private final boolean isAutoClassifying;
        private final boolean isEnabled;
        private final String message;
        private final NavigationState navigationState;
        private final Function0<Unit> onErrorDismissed;
        private final Overlay overlay;
        private final Function0<Unit> retryImage;
        private final String retryText;
        private final StyleElements.Axis reviewCaptureButtonsAxis;
        private final StepStyles.GovernmentIdStepStyle styles;

        public final ImageLoader getImageLoader() {
            return this.imageLoader;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final Overlay getOverlay() {
            return this.overlay;
        }

        public final String getImagePath() {
            return this.imagePath;
        }

        public final IdConfig.Side getCaptureSide() {
            return this.captureSide;
        }

        public final IdClass getIdClass() {
            return this.idClass;
        }

        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        public final Function0<Unit> getAcceptImage() {
            return this.acceptImage;
        }

        public final String getAcceptText() {
            return this.acceptText;
        }

        public final Function0<Unit> getRetryImage() {
            return this.retryImage;
        }

        public final String getRetryText() {
            return this.retryText;
        }

        public final String getConfirmCaptureTitle() {
            return this.confirmCaptureTitle;
        }

        public final Function0<Unit> getClose() {
            return this.close;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final String getError() {
            return this.error;
        }

        public final Function0<Unit> getOnErrorDismissed() {
            return this.onErrorDismissed;
        }

        public final NextStep.GovernmentId.AssetConfig.CapturePage getAssetConfig() {
            return this.assetConfig;
        }

        /* renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: isAutoClassifying, reason: from getter */
        public final boolean getIsAutoClassifying() {
            return this.isAutoClassifying;
        }

        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReviewScreen(ImageLoader imageLoader, String message, String disclaimer, Overlay overlay, String imagePath, IdConfig.Side captureSide, IdClass idClass, NavigationState navigationState, Function0<Unit> acceptImage, String acceptText, Function0<Unit> retryImage, String retryText, String confirmCaptureTitle, Function0<Unit> close, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str, Function0<Unit> onErrorDismissed, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z, boolean z2, StyleElements.Axis reviewCaptureButtonsAxis) {
            super(null);
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(captureSide, "captureSide");
            Intrinsics.checkNotNullParameter(idClass, "idClass");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(acceptImage, "acceptImage");
            Intrinsics.checkNotNullParameter(acceptText, "acceptText");
            Intrinsics.checkNotNullParameter(retryImage, "retryImage");
            Intrinsics.checkNotNullParameter(retryText, "retryText");
            Intrinsics.checkNotNullParameter(confirmCaptureTitle, "confirmCaptureTitle");
            Intrinsics.checkNotNullParameter(close, "close");
            Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
            Intrinsics.checkNotNullParameter(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            this.imageLoader = imageLoader;
            this.message = message;
            this.disclaimer = disclaimer;
            this.overlay = overlay;
            this.imagePath = imagePath;
            this.captureSide = captureSide;
            this.idClass = idClass;
            this.navigationState = navigationState;
            this.acceptImage = acceptImage;
            this.acceptText = acceptText;
            this.retryImage = retryImage;
            this.retryText = retryText;
            this.confirmCaptureTitle = confirmCaptureTitle;
            this.close = close;
            this.styles = governmentIdStepStyle;
            this.error = str;
            this.onErrorDismissed = onErrorDismissed;
            this.assetConfig = capturePage;
            this.isEnabled = z;
            this.isAutoClassifying = z2;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
        }
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$SubmittingScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "title", "", "description", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onBack", "Lkotlin/Function0;", "", "onCancel", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getAssetConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getPendingPageTextVerticalPosition", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$SubmittingScreen */
    public static final class SubmittingScreen extends GovernmentIdScreen2 {
        private final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;
        private final String description;
        private final NavigationState navigationState;
        private final Function0<Unit> onBack;
        private final Function0<Unit> onCancel;
        private final PendingPageTextPosition pendingPageTextVerticalPosition;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final String title;

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final NextStep.GovernmentId.AssetConfig.PendingPage getAssetConfig() {
            return this.assetConfig;
        }

        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        public final Function0<Unit> getOnBack() {
            return this.onBack;
        }

        public final Function0<Unit> getOnCancel() {
            return this.onCancel;
        }

        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmittingScreen(String title, String description, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, PendingPageTextPosition pendingPageTextVerticalPosition) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onBack, "onBack");
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.title = title;
            this.description = description;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = onBack;
            this.onCancel = onCancel;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
        }
    }

    /* compiled from: GovernmentIdScreen.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,¨\u0006/"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "title", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "countrySelectComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "idClassSelectComponent", "countryInputTitle", "idClassInputTitle", "continueButtonText", "isContinueEnabled", "", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onCountrySelected", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onIdClassSelected", "onContinueClick", "Lkotlin/Function0;", "onBackClick", "onCancelClick", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getCountrySelectComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "getIdClassSelectComponent", "getCountryInputTitle", "getIdClassInputTitle", "getContinueButtonText", "()Z", "getNavigationState", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "getOnCountrySelected", "()Lkotlin/jvm/functions/Function1;", "getOnIdClassSelected", "getOnContinueClick", "()Lkotlin/jvm/functions/Function0;", "getOnBackClick", "getOnCancelClick", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.Screen$AutoClassificationSelectCountryAndIdClassScreen */
    public static final class AutoClassificationSelectCountryAndIdClassScreen extends GovernmentIdScreen2 {
        private final String continueButtonText;
        private final String countryInputTitle;
        private final InputSelectBoxComponent countrySelectComponent;
        private final String idClassInputTitle;
        private final InputSelectBoxComponent idClassSelectComponent;
        private final boolean isContinueEnabled;
        private final NavigationState navigationState;
        private final Function0<Unit> onBackClick;
        private final Function0<Unit> onCancelClick;
        private final Function0<Unit> onContinueClick;
        private final Function1<Option, Unit> onCountrySelected;
        private final Function1<Option, Unit> onIdClassSelected;
        private final StepStyles.GovernmentIdStepStyle styles;
        private final String title;

        public final String getTitle() {
            return this.title;
        }

        public final StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final InputSelectBoxComponent getCountrySelectComponent() {
            return this.countrySelectComponent;
        }

        public final InputSelectBoxComponent getIdClassSelectComponent() {
            return this.idClassSelectComponent;
        }

        public final String getCountryInputTitle() {
            return this.countryInputTitle;
        }

        public final String getIdClassInputTitle() {
            return this.idClassInputTitle;
        }

        public final String getContinueButtonText() {
            return this.continueButtonText;
        }

        /* renamed from: isContinueEnabled, reason: from getter */
        public final boolean getIsContinueEnabled() {
            return this.isContinueEnabled;
        }

        public final NavigationState getNavigationState() {
            return this.navigationState;
        }

        public final Function1<Option, Unit> getOnCountrySelected() {
            return this.onCountrySelected;
        }

        public final Function1<Option, Unit> getOnIdClassSelected() {
            return this.onIdClassSelected;
        }

        public final Function0<Unit> getOnContinueClick() {
            return this.onContinueClick;
        }

        public final Function0<Unit> getOnBackClick() {
            return this.onBackClick;
        }

        public final Function0<Unit> getOnCancelClick() {
            return this.onCancelClick;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationSelectCountryAndIdClassScreen(String str, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, InputSelectBoxComponent countrySelectComponent, InputSelectBoxComponent idClassSelectComponent, String str2, String str3, String str4, boolean z, NavigationState navigationState, Function1<? super Option, Unit> onCountrySelected, Function1<? super Option, Unit> onIdClassSelected, Function0<Unit> onContinueClick, Function0<Unit> onBackClick, Function0<Unit> onCancelClick) {
            super(null);
            Intrinsics.checkNotNullParameter(countrySelectComponent, "countrySelectComponent");
            Intrinsics.checkNotNullParameter(idClassSelectComponent, "idClassSelectComponent");
            Intrinsics.checkNotNullParameter(navigationState, "navigationState");
            Intrinsics.checkNotNullParameter(onCountrySelected, "onCountrySelected");
            Intrinsics.checkNotNullParameter(onIdClassSelected, "onIdClassSelected");
            Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
            Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
            Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
            this.title = str;
            this.styles = governmentIdStepStyle;
            this.countrySelectComponent = countrySelectComponent;
            this.idClassSelectComponent = idClassSelectComponent;
            this.countryInputTitle = str2;
            this.idClassInputTitle = str3;
            this.continueButtonText = str4;
            this.isContinueEnabled = z;
            this.navigationState = navigationState;
            this.onCountrySelected = onCountrySelected;
            this.onIdClassSelected = onIdClassSelected;
            this.onContinueClick = onContinueClick;
            this.onBackClick = onBackClick;
            this.onCancelClick = onCancelClick;
        }
    }
}
