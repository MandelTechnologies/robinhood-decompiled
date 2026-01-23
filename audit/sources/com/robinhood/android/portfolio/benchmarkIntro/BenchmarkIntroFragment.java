package com.robinhood.android.portfolio.benchmarkIntro;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.BenchmarkIntroShownPrefState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: BenchmarkIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\r\u0010\u001e\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "introShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getIntroShownPrefState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setIntroShownPrefState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Key", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class BenchmarkIntroFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public AppType appType;
    private final Screen eventScreen = new Screen(Screen.Name.RETURNS_COMPARISON_INTRO, null, null, null, 14, null);

    @BenchmarkIntroShownPrefState
    public StateFlow2<Boolean> introShownPrefState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(BenchmarkIntroFragment benchmarkIntroFragment, int i, Composer composer, int i2) {
        benchmarkIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* compiled from: BenchmarkIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroFragment$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;)V", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final PerformanceChartType chartType;
        private final Screen sourceScreen;

        /* compiled from: BenchmarkIntroFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key((Screen) parcel.readSerializable(), parcel.readString(), PerformanceChartType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, Screen screen, String str, PerformanceChartType performanceChartType, int i, Object obj) {
            if ((i & 1) != 0) {
                screen = key.sourceScreen;
            }
            if ((i & 2) != 0) {
                str = key.accountNumber;
            }
            if ((i & 4) != 0) {
                performanceChartType = key.chartType;
            }
            return key.copy(screen, str, performanceChartType);
        }

        /* renamed from: component1, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        public final Key copy(Screen sourceScreen, String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            return new Key(sourceScreen, accountNumber, chartType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.sourceScreen, key.sourceScreen) && Intrinsics.areEqual(this.accountNumber, key.accountNumber) && this.chartType == key.chartType;
        }

        public int hashCode() {
            return (((this.sourceScreen.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.chartType.hashCode();
        }

        public String toString() {
            return "Key(sourceScreen=" + this.sourceScreen + ", accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.sourceScreen);
            dest.writeString(this.accountNumber);
            dest.writeString(this.chartType.name());
        }

        public Key(Screen sourceScreen, String accountNumber, PerformanceChartType chartType) {
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            this.sourceScreen = sourceScreen;
            this.accountNumber = accountNumber;
            this.chartType = chartType;
        }

        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PerformanceChartType getChartType() {
            return this.chartType;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((Key) INSTANCE.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
    }

    public final StateFlow2<Boolean> getIntroShownPrefState() {
        StateFlow2<Boolean> stateFlow2 = this.introShownPrefState;
        if (stateFlow2 != null) {
            return stateFlow2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("introShownPrefState");
        return null;
    }

    public final void setIntroShownPrefState(StateFlow2<Boolean> stateFlow2) {
        Intrinsics.checkNotNullParameter(stateFlow2, "<set-?>");
        this.introShownPrefState = stateFlow2;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1889693114);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1889693114, i2, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment.ComposeContent (BenchmarkIntroFragment.kt:56)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(433728945, true, new C255641(), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkIntroFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BenchmarkIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment$ComposeContent$1 */
    static final class C255641 implements Function2<Composer, Integer, Unit> {
        C255641() {
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
                ComposerKt.traceEventStart(433728945, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment.ComposeContent.<anonymous> (BenchmarkIntroFragment.kt:63)");
            }
            AppType appType = BenchmarkIntroFragment.this.getAppType();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(BenchmarkIntroFragment.this);
            final BenchmarkIntroFragment benchmarkIntroFragment = BenchmarkIntroFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkIntroFragment.C255641.invoke$lambda$1$lambda$0(benchmarkIntroFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(BenchmarkIntroFragment.this);
            final BenchmarkIntroFragment benchmarkIntroFragment2 = BenchmarkIntroFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkIntroFragment.C255641.invoke$lambda$3$lambda$2(benchmarkIntroFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(BenchmarkIntroFragment.this);
            final BenchmarkIntroFragment benchmarkIntroFragment3 = BenchmarkIntroFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkIntro.BenchmarkIntroFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkIntroFragment.C255641.invoke$lambda$5$lambda$4(benchmarkIntroFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BenchmarkIntroScreen.BenchmarkIntroScreen(appType, function0, function02, (Function0) objRememberedValue3, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(BenchmarkIntroFragment benchmarkIntroFragment) {
            Navigator navigator = benchmarkIntroFragment.getNavigator();
            android.content.Context contextRequireContext = benchmarkIntroFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new OtherMarkdownFragmentKey(BenchmarkIntroFragment2.RETURNS_COMPARISON_FAQ_CONTENTFUL_ID, null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(BenchmarkIntroFragment benchmarkIntroFragment) {
            benchmarkIntroFragment.getIntroShownPrefState().setValue(Boolean.TRUE);
            Navigator navigator = benchmarkIntroFragment.getNavigator();
            android.content.Context contextRequireContext = benchmarkIntroFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Companion companion = BenchmarkIntroFragment.INSTANCE;
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new BenchmarkSearchFragment.Key(((Key) companion.getArgs((Fragment) benchmarkIntroFragment)).getSourceScreen(), ((Key) companion.getArgs((Fragment) benchmarkIntroFragment)).getAccountNumber(), ((Key) companion.getArgs((Fragment) benchmarkIntroFragment)).getChartType()), false, false, false, false, null, false, null, null, 1020, null);
            benchmarkIntroFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(BenchmarkIntroFragment benchmarkIntroFragment) {
            benchmarkIntroFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BenchmarkIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroFragment;", "Lcom/robinhood/android/portfolio/benchmarkIntro/BenchmarkIntroFragment$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BenchmarkIntroFragment, Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Key getArgs(BenchmarkIntroFragment benchmarkIntroFragment) {
            return (Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, benchmarkIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BenchmarkIntroFragment newInstance(Key key) {
            return (BenchmarkIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BenchmarkIntroFragment benchmarkIntroFragment, Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, benchmarkIntroFragment, key);
        }
    }
}
