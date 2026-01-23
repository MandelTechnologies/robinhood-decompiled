package com.robinhood.android.portfolio.benchmarkSearch;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.portfolio.BenchmarkingSearchElement;
import com.robinhood.android.models.portfolio.api.BenchmarkingSearchElementType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchStateProvider3;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: BenchmarkSearchFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002()B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\r\u0010$\u001a\u00020!H\u0017¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0004H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "duxo", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "getDuxo", "()Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handle", "action", "Key", "Companion", "feature-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BenchmarkSearchFragment extends GenericComposeFragment implements AutoLoggableFragment, SduiActionHandler<GenericAction> {
    public AppType appType;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BenchmarkSearchDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.RETURNS_COMPARISON_SEARCH, null, null, null, 14, null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(BenchmarkSearchFragment benchmarkSearchFragment, int i, Composer composer, int i2) {
        benchmarkSearchFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* compiled from: BenchmarkSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "accountNumber", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;)V", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey, Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final String accountNumber;
        private final PerformanceChartType chartType;
        private final Screen sourceScreen;

        /* compiled from: BenchmarkSearchFragment.kt */
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

    /* compiled from: BenchmarkSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchFragment$Key;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BenchmarkSearchFragment, Key> {
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
        public Key getArgs(BenchmarkSearchFragment benchmarkSearchFragment) {
            return (Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, benchmarkSearchFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BenchmarkSearchFragment newInstance(Key key) {
            return (BenchmarkSearchFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BenchmarkSearchFragment benchmarkSearchFragment, Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, benchmarkSearchFragment, key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BenchmarkSearchDuxo getDuxo() {
        return (BenchmarkSearchDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((Key) INSTANCE.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
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
        Composer composerStartRestartGroup = composer.startRestartGroup(679932362);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(679932362, i2, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment.ComposeContent (BenchmarkSearchFragment.kt:68)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(53549695, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment.ComposeContent.1

                /* compiled from: BenchmarkSearchFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<BenchmarkSearchStateProvider3> $viewState$delegate;
                    final /* synthetic */ BenchmarkSearchFragment this$0;

                    /* compiled from: BenchmarkSearchFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BenchmarkingSearchElementType.values().length];
                            try {
                                iArr[BenchmarkingSearchElementType.EQUITY.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[BenchmarkingSearchElementType.CRYPTO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[BenchmarkingSearchElementType.UNKNOWN.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(BenchmarkSearchFragment benchmarkSearchFragment, SnapshotState4<? extends BenchmarkSearchStateProvider3> snapshotState4) {
                        this.this$0 = benchmarkSearchFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(BenchmarkSearchFragment benchmarkSearchFragment, BenchmarkSearchStateProvider3 benchmarkSearchStateProvider3, List benchmarkSelections) {
                        Intrinsics.checkNotNullParameter(benchmarkSelections, "benchmarkSelections");
                        benchmarkSearchFragment.getDuxo().onSave(((BenchmarkSearchStateProvider3.Ready) benchmarkSearchStateProvider3).getSettings(), benchmarkSelections);
                        benchmarkSearchFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(BenchmarkSearchFragment benchmarkSearchFragment, BenchmarkingSearchElement element) {
                        Intrinsics.checkNotNullParameter(element, "element");
                        int i = WhenMappings.$EnumSwitchMapping$0[element.getElementType().ordinal()];
                        if (i == 1) {
                            Navigator navigator = benchmarkSearchFragment.getNavigator();
                            android.content.Context contextRequireContext = benchmarkSearchFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(element.getSymbol(), InstrumentDetailSource.NONE, (String) null, 4, (DefaultConstructorMarker) null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        } else if (i == 2) {
                            Navigator navigator2 = benchmarkSearchFragment.getNavigator();
                            android.content.Context contextRequireContext2 = benchmarkSearchFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                            Navigator.DefaultImpls.showFragment$default(navigator2, contextRequireContext2, new LegacyFragmentKey.CryptoWithSymbol(element.getSymbol()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        } else if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: BenchmarkSearchFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6, reason: invalid class name */
                    static final class AnonymousClass6 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ BenchmarkSearchFragment this$0;

                        AnonymousClass6(BenchmarkSearchFragment benchmarkSearchFragment) {
                            this.this$0 = benchmarkSearchFragment;
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
                                ComposerKt.traceEventStart(252827835, i, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (BenchmarkSearchFragment.kt:122)");
                            }
                            AppType appType = this.this$0.getAppType();
                            BenchmarkSearchStateProvider3.Ready loadingMock = BenchmarkSearchStateProvider3.INSTANCE.getLoadingMock();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6$1$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                    public final boolean mo15941handle(GenericAction it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return true;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                            composer.endReplaceGroup();
                            BaseActivity baseActivityRequireBaseActivity = this.this$0.requireBaseActivity();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(baseActivityRequireBaseActivity);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new BenchmarkSearchFragment5(baseActivityRequireBaseActivity);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BenchmarkSearchFragment.C255931.AnonymousClass1.AnonymousClass6.invoke$lambda$3$lambda$2((List) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BenchmarkSearchFragment.C255931.AnonymousClass1.AnonymousClass6.invoke$lambda$5$lambda$4((String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function12 = (Function1) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BenchmarkSearchFragment.C255931.AnonymousClass1.AnonymousClass6.invoke$lambda$7$lambda$6((BenchmarkingSearchElement) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            Function1 function13 = (Function1) objRememberedValue5;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composer.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$6$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue6);
                            }
                            composer.endReplaceGroup();
                            BenchmarkSearchScreen.BenchmarkSearchScreen(appType, loadingMock, sduiActionHandler, function0, function1, function12, function13, (Function0) objRememberedValue6, null, composer, 14376960, 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(List it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(BenchmarkingSearchElement it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-962532278, i, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment.ComposeContent.<anonymous>.<anonymous> (BenchmarkSearchFragment.kt:78)");
                        }
                        final BenchmarkSearchStateProvider3 benchmarkSearchStateProvider3ComposeContent$lambda$0 = BenchmarkSearchFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        if (benchmarkSearchStateProvider3ComposeContent$lambda$0 instanceof BenchmarkSearchStateProvider3.Ready) {
                            composer.startReplaceGroup(-1597231089);
                            AppType appType = this.this$0.getAppType();
                            BenchmarkSearchStateProvider3.Ready ready = (BenchmarkSearchStateProvider3.Ready) benchmarkSearchStateProvider3ComposeContent$lambda$0;
                            Object objRequireBaseActivity = this.this$0.requireBaseActivity();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(objRequireBaseActivity);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BenchmarkSearchFragment2(objRequireBaseActivity);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue;
                            composer.endReplaceGroup();
                            Object duxo = this.this$0.getDuxo();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(duxo);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new BenchmarkSearchFragment3(duxo);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            KFunction kFunction2 = (KFunction) objRememberedValue2;
                            composer.endReplaceGroup();
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                            BenchmarkSearchFragment benchmarkSearchFragment = this.this$0;
                            Function0 function0 = (Function0) kFunction;
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changedInstance(benchmarkSearchStateProvider3ComposeContent$lambda$0);
                            final BenchmarkSearchFragment benchmarkSearchFragment2 = this.this$0;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BenchmarkSearchFragment.C255931.AnonymousClass1.invoke$lambda$3$lambda$2(benchmarkSearchFragment2, benchmarkSearchStateProvider3ComposeContent$lambda$0, (List) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composer.endReplaceGroup();
                            Function1 function12 = (Function1) kFunction2;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                            final BenchmarkSearchFragment benchmarkSearchFragment3 = this.this$0;
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BenchmarkSearchFragment.C255931.AnonymousClass1.invoke$lambda$5$lambda$4(benchmarkSearchFragment3, (BenchmarkingSearchElement) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function13 = (Function1) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            composer.endReplaceGroup();
                            BenchmarkSearchScreen.BenchmarkSearchScreen(appType, ready, benchmarkSearchFragment, function0, function1, function12, function13, (Function0) objRememberedValue5, modifierNavigationBarsPadding, composer, 12582912, 0);
                            composer.endReplaceGroup();
                        } else if (Intrinsics.areEqual(benchmarkSearchStateProvider3ComposeContent$lambda$0, BenchmarkSearchStateProvider3.Loading.INSTANCE)) {
                            composer.startReplaceGroup(-1575475240);
                            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(252827835, true, new AnonymousClass6(this.this$0), composer, 54), composer, 3078, 6);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1594476584);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(53549695, i3, -1, "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment.ComposeContent.<anonymous> (BenchmarkSearchFragment.kt:77)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-962532278, true, new AnonymousClass1(BenchmarkSearchFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkSearchFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BenchmarkSearchStateProvider3 ComposeContent$lambda$0(SnapshotState4<? extends BenchmarkSearchStateProvider3> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof GenericAction.Deeplink)) {
            return false;
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        return true;
    }
}
