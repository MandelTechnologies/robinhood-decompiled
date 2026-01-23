package com.robinhood.android.gold.upgrade.unified;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: GoldUnifiedHostFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0014\u001a\u00020\u001526\u0010\u0016\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u001f¢\u0006\u0002\b\u001e0\u0017H\u0017¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUnifiedHostFragment extends BaseComposeNavHostFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldUnifiedHostDuxo.class);
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$2(GoldUnifiedHostFragment goldUnifiedHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        goldUnifiedHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    private final GoldUnifiedHostDuxo getDuxo() {
        return (GoldUnifiedHostDuxo) this.duxo.getValue();
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-811900906);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-811900906, i2, -1, "com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostFragment.NavHostComposeContent (GoldUnifiedHostFragment.kt:27)");
            }
            GoldUnifiedHostDuxo duxo = getDuxo();
            Context loggingContext = ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingContext();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldUnifiedHostFragment.NavHostComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            GoldUnifiedHostComposable3.GoldUnifiedHostComposable(duxo, loggingContext, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedHostFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldUnifiedHostFragment.NavHostComposeContent$lambda$2(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$1$lambda$0(GoldUnifiedHostFragment goldUnifiedHostFragment) {
        goldUnifiedHostFragment.getUserLeapManager().setPendingSurvey(Survey.GOLD_UPGRADE_V2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return getDuxo().onBackPressed();
    }

    /* compiled from: GoldUnifiedHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment$Args;", "Landroid/os/Parcelable;", "feature", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "exitDeeplink", "sageId", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Ljava/lang/String;)V", "getFeature", "()Ljava/lang/String;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getExitDeeplink", "getSageId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String exitDeeplink;
        private final String feature;
        private final Context loggingContext;
        private final String sageId;

        /* compiled from: GoldUnifiedHostFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (Context) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, Context context, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.feature;
            }
            if ((i & 2) != 0) {
                context = args.loggingContext;
            }
            if ((i & 4) != 0) {
                str2 = args.exitDeeplink;
            }
            if ((i & 8) != 0) {
                str3 = args.sageId;
            }
            return args.copy(str, context, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSageId() {
            return this.sageId;
        }

        public final Args copy(String feature, Context loggingContext, String exitDeeplink, String sageId) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(feature, loggingContext, exitDeeplink, sageId);
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
            return Intrinsics.areEqual(this.feature, args.feature) && Intrinsics.areEqual(this.loggingContext, args.loggingContext) && Intrinsics.areEqual(this.exitDeeplink, args.exitDeeplink) && Intrinsics.areEqual(this.sageId, args.sageId);
        }

        public int hashCode() {
            String str = this.feature;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.loggingContext.hashCode()) * 31;
            String str2 = this.exitDeeplink;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sageId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Args(feature=" + this.feature + ", loggingContext=" + this.loggingContext + ", exitDeeplink=" + this.exitDeeplink + ", sageId=" + this.sageId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.feature);
            dest.writeSerializable(this.loggingContext);
            dest.writeString(this.exitDeeplink);
            dest.writeString(this.sageId);
        }

        public Args(String str, Context loggingContext, String str2, String str3) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.feature = str;
            this.loggingContext = loggingContext;
            this.exitDeeplink = str2;
            this.sageId = str3;
        }

        public /* synthetic */ Args(String str, Context context, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, context, str2, (i & 8) != 0 ? null : str3);
        }

        public final String getFeature() {
            return this.feature;
        }

        public final Context getLoggingContext() {
            return this.loggingContext;
        }

        public final String getExitDeeplink() {
            return this.exitDeeplink;
        }

        public final String getSageId() {
            return this.sageId;
        }
    }

    /* compiled from: GoldUnifiedHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment;", "Lcom/robinhood/android/gold/upgrade/unified/GoldUnifiedHostFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldUnifiedHostFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldUnifiedHostFragment goldUnifiedHostFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldUnifiedHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldUnifiedHostFragment newInstance(Args args) {
            return (GoldUnifiedHostFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldUnifiedHostFragment goldUnifiedHostFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldUnifiedHostFragment, args);
        }
    }
}
