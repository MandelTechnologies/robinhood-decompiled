package com.robinhood.android.advisory.onboarding.questionnaire;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-advisory-onboarding_externalDebug", "state", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PortfolioQuestionnaireIntroFragmentV2 extends GenericComposeFragment {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PortfolioQuestionnaireIntroFragmentV2.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof PortfolioQuestionnaireIntroFragmentV2.Callbacks)) {
                parentFragment = null;
            }
            PortfolioQuestionnaireIntroFragmentV2.Callbacks callbacks = (PortfolioQuestionnaireIntroFragmentV2.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof PortfolioQuestionnaireIntroFragmentV2.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PortfolioQuestionnaireIntroDuxo.class);

    /* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Callbacks;", "", "onQuestionnaireIntroContinueClicked", "", "applicationId", "Ljava/util/UUID;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onQuestionnaireIntroContinueClicked(UUID applicationId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2, int i, Composer composer, int i2) {
        portfolioQuestionnaireIntroFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final PortfolioQuestionnaireIntroDuxo getDuxo() {
        return (PortfolioQuestionnaireIntroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2146947856);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2146947856, i2, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2.ComposeContent (PortfolioQuestionnaireIntroFragmentV2.kt:34)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            Object callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PortfolioQuestionnaireIntroFragmentV22(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PortfolioQuestionnaireIntroFragmentV2.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen(portfolioQuestionnaireIntroViewStateComposeContent$lambda$0, function1, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 8);
            Event<PortfolioQuestionnaireIntroEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle2) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new PortfolioQuestionnaireIntroFragmentV23(snapshotState4CollectAsStateWithLifecycle2, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(eventComposeContent$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioQuestionnaireIntroFragmentV2.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2) {
        portfolioQuestionnaireIntroFragmentV2.requireBaseActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    /* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Args;", "Landroid/os/Parcelable;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "entryPoint", "Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;Ljava/lang/String;)V", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getEntryPoint", "()Lcom/robinhood/android/advisory/contracts/AdvisoryOnboardingKey$EntryPoint;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType brokerageAccountType;
        private final AdvisoryOnboardingKey.EntryPoint entryPoint;
        private final String source;

        /* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(BrokerageAccountType.valueOf(parcel.readString()), (AdvisoryOnboardingKey.EntryPoint) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, AdvisoryOnboardingKey.EntryPoint entryPoint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            if ((i & 2) != 0) {
                entryPoint = args.entryPoint;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(brokerageAccountType, entryPoint, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* renamed from: component2, reason: from getter */
        public final AdvisoryOnboardingKey.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(BrokerageAccountType brokerageAccountType, AdvisoryOnboardingKey.EntryPoint entryPoint, String source) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(brokerageAccountType, entryPoint, source);
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
            return this.brokerageAccountType == args.brokerageAccountType && Intrinsics.areEqual(this.entryPoint, args.entryPoint) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((this.brokerageAccountType.hashCode() * 31) + this.entryPoint.hashCode()) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(brokerageAccountType=" + this.brokerageAccountType + ", entryPoint=" + this.entryPoint + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.brokerageAccountType.name());
            dest.writeParcelable(this.entryPoint, flags);
            dest.writeString(this.source);
        }

        public Args(BrokerageAccountType brokerageAccountType, AdvisoryOnboardingKey.EntryPoint entryPoint, String str) {
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.brokerageAccountType = brokerageAccountType;
            this.entryPoint = entryPoint;
            this.source = str;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, AdvisoryOnboardingKey.EntryPoint entryPoint, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, entryPoint, (i & 4) != 0 ? null : str);
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final AdvisoryOnboardingKey.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: PortfolioQuestionnaireIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PortfolioQuestionnaireIntroFragmentV2, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, portfolioQuestionnaireIntroFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PortfolioQuestionnaireIntroFragmentV2 newInstance(Args args) {
            return (PortfolioQuestionnaireIntroFragmentV2) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PortfolioQuestionnaireIntroFragmentV2 portfolioQuestionnaireIntroFragmentV2, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, portfolioQuestionnaireIntroFragmentV2, args);
        }
    }

    private static final PortfolioQuestionnaireIntroViewState ComposeContent$lambda$0(SnapshotState4<PortfolioQuestionnaireIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<PortfolioQuestionnaireIntroEvent> ComposeContent$lambda$1(SnapshotState4<Event<PortfolioQuestionnaireIntroEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
