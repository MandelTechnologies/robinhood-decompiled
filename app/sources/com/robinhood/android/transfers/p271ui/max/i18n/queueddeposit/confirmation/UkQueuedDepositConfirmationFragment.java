package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositActivity2;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: UkQueuedDepositConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0003)*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\r\u0010\"\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\u00060\u0017j\u0002`\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001a¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UkQueuedDepositConfirmationFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UkQueuedDepositConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UkQueuedDepositConfirmationDuxo.class);

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UkQueuedDepositConfirmationFragment.eventScreen_delegate$lambda$0();
        }
    });

    /* renamed from: screenEventContext$delegate, reason: from kotlin metadata */
    private final Lazy screenEventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UkQueuedDepositConfirmationFragment.screenEventContext_delegate$lambda$1(this.f$0);
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkQueuedDepositConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UkQueuedDepositConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Callbacks;", "", "onFlowCompleted", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFlowCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(UkQueuedDepositConfirmationFragment ukQueuedDepositConfirmationFragment, int i, Composer composer, int i2) {
        ukQueuedDepositConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final UkQueuedDepositConfirmationDuxo getDuxo() {
        return (UkQueuedDepositConfirmationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.POST_QUEUED_DEPOSIT_CONFIRMATION, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.screenEventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.robinhood.rosetta.eventlogging.Context screenEventContext_delegate$lambda$1(UkQueuedDepositConfirmationFragment ukQueuedDepositConfirmationFragment) {
        com.robinhood.rosetta.eventlogging.Context eventContext = ((Args) INSTANCE.getArgs((Fragment) ukQueuedDepositConfirmationFragment)).getEventContext();
        if (eventContext != null) {
            return eventContext;
        }
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476600419);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476600419, i2, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment.ComposeContent (UkQueuedDepositConfirmationFragment.kt:52)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Screen eventScreen = getEventScreen();
            com.robinhood.rosetta.eventlogging.Context screenEventContext = getScreenEventContext();
            UkQueuedDepositConfirmationViewState ukQueuedDepositConfirmationViewStateComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UkQueuedDepositConfirmationFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            UkQueuedDepositConfirmationComposable3.UkQueuedDepositConfirmationComposable(eventScreen, screenEventContext, ukQueuedDepositConfirmationViewStateComposeContent$lambda$2, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkQueuedDepositConfirmationFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        UkQueuedDepositActivity2.configureToolbarForOnboarding(this, toolbar);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onFlowCompleted();
        return true;
    }

    /* compiled from: UkQueuedDepositConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Args;", "Landroid/os/Parcelable;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "postTransferPage", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;)V", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getPostTransferPage", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.rosetta.eventlogging.Context eventContext;
        private final UiPostTransferPage.UkQueuedDeposit postTransferPage;

        /* compiled from: UkQueuedDepositConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable(), (UiPostTransferPage.UkQueuedDeposit) parcel.readParcelable(Args.class.getClassLoader()));
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
            dest.writeSerializable(this.eventContext);
            dest.writeParcelable(this.postTransferPage, flags);
        }

        public Args(com.robinhood.rosetta.eventlogging.Context context, UiPostTransferPage.UkQueuedDeposit postTransferPage) {
            Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
            this.eventContext = context;
            this.postTransferPage = postTransferPage;
        }

        public final com.robinhood.rosetta.eventlogging.Context getEventContext() {
            return this.eventContext;
        }

        public final UiPostTransferPage.UkQueuedDeposit getPostTransferPage() {
            return this.postTransferPage;
        }
    }

    /* compiled from: UkQueuedDepositConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkQueuedDepositConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkQueuedDepositConfirmationFragment ukQueuedDepositConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukQueuedDepositConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkQueuedDepositConfirmationFragment newInstance(Args args) {
            return (UkQueuedDepositConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkQueuedDepositConfirmationFragment ukQueuedDepositConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukQueuedDepositConfirmationFragment, args);
        }
    }

    private static final UkQueuedDepositConfirmationViewState ComposeContent$lambda$2(SnapshotState4<UkQueuedDepositConfirmationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
