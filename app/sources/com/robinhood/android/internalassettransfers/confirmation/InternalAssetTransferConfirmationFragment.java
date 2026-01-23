package com.robinhood.android.internalassettransfers.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.EdgeToEdge;
import androidx.view.SystemBarStyle;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InternalAssetTransferConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferConfirmationFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof InternalAssetTransferConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InternalAssetTransferConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternalAssetTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Callbacks;", "", "onViewTransferDetails", "", "assetTransferUuid", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onViewTransferDetails(String assetTransferUuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(Resources it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment, int i, Composer composer, int i2) {
        internalAssetTransferConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-150013639);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-150013639, i2, -1, "com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment.ComposeContent (InternalAssetTransferConfirmationFragment.kt:27)");
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            SystemBarStyle.Companion companion = SystemBarStyle.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(InternalAssetTransferConfirmationFragment.ComposeContent$lambda$1$lambda$0((Resources) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EdgeToEdge.enable$default(fragmentActivityRequireActivity, companion.auto(0, 0, (Function1) objRememberedValue), null, 2, null);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INTERNAL_ASSET_TRANSFER_CONFIRMATION, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-577753810, true, new C190982(), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InternalAssetTransferConfirmationFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InternalAssetTransferConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$ComposeContent$2 */
    static final class C190982 implements Function2<Composer, Integer, Unit> {
        C190982() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577753810, i, -1, "com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment.ComposeContent.<anonymous> (InternalAssetTransferConfirmationFragment.kt:41)");
            }
            Companion companion = InternalAssetTransferConfirmationFragment.INSTANCE;
            UiIatAccount sinkAccount = ((Args) companion.getArgs((Fragment) InternalAssetTransferConfirmationFragment.this)).getSinkAccount();
            boolean exitToSinkAccountDashboard = ((Args) companion.getArgs((Fragment) InternalAssetTransferConfirmationFragment.this)).getExitToSinkAccountDashboard();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(InternalAssetTransferConfirmationFragment.this);
            final InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment = InternalAssetTransferConfirmationFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferConfirmationFragment.C190982.invoke$lambda$1$lambda$0(internalAssetTransferConfirmationFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(InternalAssetTransferConfirmationFragment.this);
            final InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment2 = InternalAssetTransferConfirmationFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferConfirmationFragment.C190982.invoke$lambda$3$lambda$2(internalAssetTransferConfirmationFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(InternalAssetTransferConfirmationFragment.this);
            final InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment3 = InternalAssetTransferConfirmationFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.internalassettransfers.confirmation.InternalAssetTransferConfirmationFragment$ComposeContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferConfirmationFragment.C190982.invoke$lambda$5$lambda$4(internalAssetTransferConfirmationFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            InternalAssetTransferConfirmation5.InternalAssetTransferConfirmation(sinkAccount, exitToSinkAccountDashboard, function0, function02, (Function0) objRememberedValue3, ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment) {
            internalAssetTransferConfirmationFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment) {
            internalAssetTransferConfirmationFragment.requireActivity().finish();
            Companion companion = InternalAssetTransferConfirmationFragment.INSTANCE;
            if (((Args) companion.getArgs((Fragment) internalAssetTransferConfirmationFragment)).getExitToSinkAccountDashboard()) {
                Navigator navigator = internalAssetTransferConfirmationFragment.getNavigator();
                Context contextRequireContext = internalAssetTransferConfirmationFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, InternalAssetTransferConfirmation5.getDashboardIntentKey(((Args) companion.getArgs((Fragment) internalAssetTransferConfirmationFragment)).getSinkAccount()), null, false, null, null, 60, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment) {
            internalAssetTransferConfirmationFragment.getCallbacks().onViewTransferDetails(((Args) InternalAssetTransferConfirmationFragment.INSTANCE.getArgs((Fragment) internalAssetTransferConfirmationFragment)).getAssetTransferUuid());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InternalAssetTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Args;", "Landroid/os/Parcelable;", "assetTransferUuid", "", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "source", "exitToSinkAccountDashboard", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Ljava/lang/String;Z)V", "getAssetTransferUuid", "()Ljava/lang/String;", "getSinkAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSource", "getExitToSinkAccountDashboard", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String assetTransferUuid;
        private final boolean exitToSinkAccountDashboard;
        private final UiIatAccount sinkAccount;
        private final String source;

        /* compiled from: InternalAssetTransferConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), UiIatAccount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UiIatAccount uiIatAccount, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.assetTransferUuid;
            }
            if ((i & 2) != 0) {
                uiIatAccount = args.sinkAccount;
            }
            if ((i & 4) != 0) {
                str2 = args.source;
            }
            if ((i & 8) != 0) {
                z = args.exitToSinkAccountDashboard;
            }
            return args.copy(str, uiIatAccount, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssetTransferUuid() {
            return this.assetTransferUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getExitToSinkAccountDashboard() {
            return this.exitToSinkAccountDashboard;
        }

        public final Args copy(String assetTransferUuid, UiIatAccount sinkAccount, String source, boolean exitToSinkAccountDashboard) {
            Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(assetTransferUuid, sinkAccount, source, exitToSinkAccountDashboard);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.assetTransferUuid, args.assetTransferUuid) && Intrinsics.areEqual(this.sinkAccount, args.sinkAccount) && Intrinsics.areEqual(this.source, args.source) && this.exitToSinkAccountDashboard == args.exitToSinkAccountDashboard;
        }

        public int hashCode() {
            return (((((this.assetTransferUuid.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.exitToSinkAccountDashboard);
        }

        public String toString() {
            return "Args(assetTransferUuid=" + this.assetTransferUuid + ", sinkAccount=" + this.sinkAccount + ", source=" + this.source + ", exitToSinkAccountDashboard=" + this.exitToSinkAccountDashboard + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.assetTransferUuid);
            this.sinkAccount.writeToParcel(dest, flags);
            dest.writeString(this.source);
            dest.writeInt(this.exitToSinkAccountDashboard ? 1 : 0);
        }

        public Args(String assetTransferUuid, UiIatAccount sinkAccount, String source, boolean z) {
            Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(source, "source");
            this.assetTransferUuid = assetTransferUuid;
            this.sinkAccount = sinkAccount;
            this.source = source;
            this.exitToSinkAccountDashboard = z;
        }

        public final String getAssetTransferUuid() {
            return this.assetTransferUuid;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getExitToSinkAccountDashboard() {
            return this.exitToSinkAccountDashboard;
        }
    }

    /* compiled from: InternalAssetTransferConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment;", "Lcom/robinhood/android/internalassettransfers/confirmation/InternalAssetTransferConfirmationFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternalAssetTransferConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internalAssetTransferConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternalAssetTransferConfirmationFragment newInstance(Args args) {
            return (InternalAssetTransferConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternalAssetTransferConfirmationFragment internalAssetTransferConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internalAssetTransferConfirmationFragment, args);
        }
    }
}
