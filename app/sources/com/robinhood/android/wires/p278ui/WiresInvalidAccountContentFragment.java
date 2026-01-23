package com.robinhood.android.wires.p278ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.SdOnboardingIntentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.models.api.bonfire.transfer.wires.WireInvalidAccountButtonAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WiresInvalidAccountContentFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresInvalidAccountContentFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresInvalidAccountContentFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WiresInvalidAccountContentFragment.eventScreen_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WiresInvalidAccountContentFragment.screenEventContext_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WiresInvalidAccountContentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WireInvalidAccountButtonAction.values().length];
            try {
                iArr[WireInvalidAccountButtonAction.BROKERAGE_ACCOUNT_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WireInvalidAccountButtonAction.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment, int i, Composer composer, int i2) {
        wiresInvalidAccountContentFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment) {
        return new Screen(Screen.Name.WIRE_INFO_SCREEN, null, ((Args) INSTANCE.getArgs((Fragment) wiresInvalidAccountContentFragment)).getScreenIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return (Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context screenEventContext_delegate$lambda$1(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GetWiresContext.getWiresContext(wiresInvalidAccountContentFragment), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -65, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1658756999);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1658756999, i2, -1, "com.robinhood.android.wires.ui.WiresInvalidAccountContentFragment.ComposeContent (WiresInvalidAccountContentFragment.kt:39)");
            }
            ApiWireDetailsContent.InvalidAccountContent content = ((Args) INSTANCE.getArgs((Fragment) this)).getContent();
            Screen eventScreen = getEventScreen();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WiresInvalidAccountContentFragment.ComposeContent$lambda$3$lambda$2(this.f$0, (WireInvalidAccountButtonAction) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            WiresInvalidAccountContentComposable.WiresInvalidAccountContentComposable(content, eventScreen, function1, WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM())), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresInvalidAccountContentFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment, WireInvalidAccountButtonAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            Navigator navigator = wiresInvalidAccountContentFragment.getNavigator();
            android.content.Context contextRequireContext = wiresInvalidAccountContentFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new SdOnboardingIntentKey(null, null, null, null, false, 31, null), null, false, null, null, 60, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            wiresInvalidAccountContentFragment.requireActivity().finish();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WiresInvalidAccountContentFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresInvalidAccountContentFragment$Args;", "Landroid/os/Parcelable;", "screenIdentifier", "", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;)V", "getScreenIdentifier", "()Ljava/lang/String;", "getContent", "()Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiWireDetailsContent.InvalidAccountContent content;
        private final String screenIdentifier;

        /* compiled from: WiresInvalidAccountContentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (ApiWireDetailsContent.InvalidAccountContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.screenIdentifier);
            dest.writeParcelable(this.content, flags);
        }

        public Args(String screenIdentifier, ApiWireDetailsContent.InvalidAccountContent content) {
            Intrinsics.checkNotNullParameter(screenIdentifier, "screenIdentifier");
            Intrinsics.checkNotNullParameter(content, "content");
            this.screenIdentifier = screenIdentifier;
            this.content = content;
        }

        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        public final ApiWireDetailsContent.InvalidAccountContent getContent() {
            return this.content;
        }
    }

    /* compiled from: WiresInvalidAccountContentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/WiresInvalidAccountContentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/wires/ui/WiresInvalidAccountContentFragment;", "Lcom/robinhood/android/wires/ui/WiresInvalidAccountContentFragment$Args;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WiresInvalidAccountContentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, wiresInvalidAccountContentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WiresInvalidAccountContentFragment newInstance(Args args) {
            return (WiresInvalidAccountContentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WiresInvalidAccountContentFragment wiresInvalidAccountContentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, wiresInvalidAccountContentFragment, args);
        }
    }
}
