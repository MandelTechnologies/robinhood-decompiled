package com.robinhood.android.gold.sage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.sage.GoldSageNavHostFragment;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016JO\u0010\u000e\u001a\u00020\u000b2@\u0010\u000f\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000b0\u0011j\u0007`\u0019¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00180\u0010H\u0017¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "<init>", "()V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "onAttach", "", "context", "Landroid/content/Context;", "NavHostComposeContent", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "openUrlInApp", "uri", "Landroid/net/Uri;", "openUrlExternally", "Args", "Companion", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSageNavHostFragment extends BaseComposeNavHostFragment {
    public LoggedCustomTabs loggedCustomTabs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(GoldSageNavHostFragment goldSageNavHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        goldSageNavHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final LoggedCustomTabs getLoggedCustomTabs() {
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs;
        if (loggedCustomTabs != null) {
            return loggedCustomTabs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedCustomTabs");
        return null;
    }

    public final void setLoggedCustomTabs(LoggedCustomTabs loggedCustomTabs) {
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "<set-?>");
        this.loggedCustomTabs = loggedCustomTabs;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), DayNightOverlay.DAY, null, 2, null);
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(1158152756);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1158152756, i2, -1, "com.robinhood.android.gold.sage.GoldSageNavHostFragment.NavHostComposeContent (GoldSageNavHostFragment.kt:36)");
            }
            final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1744911892, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageNavHostFragment.NavHostComposeContent.1

                /* compiled from: GoldSageNavHostFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.gold.sage.GoldSageNavHostFragment$NavHostComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ GoldSageNavHostFragment this$0;

                    AnonymousClass1(GoldSageNavHostFragment goldSageNavHostFragment, NavHostController navHostController) {
                        this.this$0 = goldSageNavHostFragment;
                        this.$navController = navHostController;
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
                            ComposerKt.traceEventStart(1533973431, i, -1, "com.robinhood.android.gold.sage.GoldSageNavHostFragment.NavHostComposeContent.<anonymous>.<anonymous> (GoldSageNavHostFragment.kt:40)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final GoldSageNavHostFragment goldSageNavHostFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageNavHostFragment$NavHostComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return GoldSageNavHostFragment.C178821.AnonymousClass1.invoke$lambda$1$lambda$0(goldSageNavHostFragment, (NavGraphBuilder) obj, (NavHostController) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf((Function2) objRememberedValue), GoldSageDestinations.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, composer, ComposableDestination.$stable << 6, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(GoldSageNavHostFragment goldSageNavHostFragment, NavGraphBuilder persistentSetOf, NavHostController navController) {
                        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
                        Intrinsics.checkNotNullParameter(navController, "navController");
                        GoldSageNavHostFragment2 goldSageNavHostFragment2 = new GoldSageNavHostFragment2(goldSageNavHostFragment);
                        GoldSageNavHostFragment3 goldSageNavHostFragment3 = new GoldSageNavHostFragment3(goldSageNavHostFragment);
                        GoldSageNavHostFragment4 goldSageNavHostFragment4 = new GoldSageNavHostFragment4(goldSageNavHostFragment.requireActivity());
                        GoldSageNavHostFragment5 goldSageNavHostFragment5 = new GoldSageNavHostFragment5(goldSageNavHostFragment.requireBaseActivity().getActivityErrorHandler());
                        Companion companion = GoldSageNavHostFragment.INSTANCE;
                        GoldSageNavGraph.goldSageNavGraph(persistentSetOf, navController, goldSageNavHostFragment2, goldSageNavHostFragment3, goldSageNavHostFragment4, goldSageNavHostFragment5, ((Args) companion.getArgs((Fragment) goldSageNavHostFragment)).getLoggingContext(), ((Args) companion.getArgs((Fragment) goldSageNavHostFragment)).getSageId());
                        return Unit.INSTANCE;
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
                        ComposerKt.traceEventStart(-1744911892, i3, -1, "com.robinhood.android.gold.sage.GoldSageNavHostFragment.NavHostComposeContent.<anonymous> (GoldSageNavHostFragment.kt:39)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1533973431, true, new AnonymousClass1(GoldSageNavHostFragment.this, navHostControllerRememberNavController), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageNavHostFragment.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrlInApp(Uri uri) {
        if (uri != null) {
            LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            LoggedCustomTabs.viewUrl$default(loggedCustomTabs, contextRequireContext, HttpUrl2.toHttpUrl(uri), "GOLD_SAGE_APPLICATION", null, null, null, null, null, null, null, null, 2040, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrlExternally(Uri uri) {
        startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    /* compiled from: GoldSageNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageNavHostFragment$Args;", "Landroid/os/Parcelable;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "sageId", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;)V", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getSageId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final com.robinhood.rosetta.eventlogging.Context loggingContext;
        private final String sageId;

        /* compiled from: GoldSageNavHostFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, com.robinhood.rosetta.eventlogging.Context context, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                context = args.loggingContext;
            }
            if ((i & 2) != 0) {
                str = args.sageId;
            }
            return args.copy(context, str);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSageId() {
            return this.sageId;
        }

        public final Args copy(com.robinhood.rosetta.eventlogging.Context loggingContext, String sageId) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(loggingContext, sageId);
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
            return Intrinsics.areEqual(this.loggingContext, args.loggingContext) && Intrinsics.areEqual(this.sageId, args.sageId);
        }

        public int hashCode() {
            int iHashCode = this.loggingContext.hashCode() * 31;
            String str = this.sageId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(loggingContext=" + this.loggingContext + ", sageId=" + this.sageId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.loggingContext);
            dest.writeString(this.sageId);
        }

        public Args(com.robinhood.rosetta.eventlogging.Context loggingContext, String str) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.loggingContext = loggingContext;
            this.sageId = str;
        }

        public /* synthetic */ Args(com.robinhood.rosetta.eventlogging.Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : str);
        }

        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final String getSageId() {
            return this.sageId;
        }
    }

    /* compiled from: GoldSageNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageNavHostFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/sage/GoldSageNavHostFragment;", "Lcom/robinhood/android/gold/sage/GoldSageNavHostFragment$Args;", "<init>", "()V", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldSageNavHostFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldSageNavHostFragment goldSageNavHostFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldSageNavHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldSageNavHostFragment newInstance(Args args) {
            return (GoldSageNavHostFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldSageNavHostFragment goldSageNavHostFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldSageNavHostFragment, args);
        }
    }
}
