package com.robinhood.compose.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ShimmerLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/compose/app/ShimmerLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ShimmerLoadingFragment extends GenericComposeFragment {
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ShimmerLoadingFragment shimmerLoadingFragment, int i, Composer composer, int i2) {
        shimmerLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(716868853);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(716868853, i2, -1, "com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent (ShimmerLoadingFragment.kt:25)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-68040527, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-68040527, i4, -1, "com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent.<anonymous> (ShimmerLoadingFragment.kt:30)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ShimmerLoadingFragment2.INSTANCE.getLambda$1916351204$lib_compose_app_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2084569072, true, new AnonymousClass1(ShimmerLoadingFragment.this), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ShimmerLoadingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.compose.app.ShimmerLoadingFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ ShimmerLoadingFragment this$0;

                    /* compiled from: ShimmerLoadingFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.compose.app.ShimmerLoadingFragment$ComposeContent$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Args.NavButtonType.values().length];
                            try {
                                iArr[Args.NavButtonType.BACK.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Args.NavButtonType.CLOSE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Args.NavButtonType.NONE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(ShimmerLoadingFragment shimmerLoadingFragment) {
                        this.this$0 = shimmerLoadingFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2084569072, i2, -1, "com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent.<anonymous>.<anonymous> (ShimmerLoadingFragment.kt:33)");
                        }
                        int i3 = WhenMappings.$EnumSwitchMapping$0[((Args) ShimmerLoadingFragment.INSTANCE.getArgs((Fragment) this.this$0)).getNavButtonType().ordinal()];
                        if (i3 == 1) {
                            composer.startReplaceGroup(-1816114613);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final ShimmerLoadingFragment shimmerLoadingFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.compose.app.ShimmerLoadingFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ShimmerLoadingFragment.C324371.AnonymousClass1.invoke$lambda$1$lambda$0(shimmerLoadingFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                            composer.endReplaceGroup();
                        } else if (i3 == 2) {
                            composer.startReplaceGroup(-1816107827);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final ShimmerLoadingFragment shimmerLoadingFragment2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.app.ShimmerLoadingFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ShimmerLoadingFragment.C324371.AnonymousClass1.invoke$lambda$3$lambda$2(shimmerLoadingFragment2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                            composer.endReplaceGroup();
                        } else {
                            if (i3 != 3) {
                                composer.startReplaceGroup(-1816116875);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-464560893);
                            composer.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(ShimmerLoadingFragment shimmerLoadingFragment) {
                        shimmerLoadingFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(ShimmerLoadingFragment shimmerLoadingFragment) {
                        shimmerLoadingFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1142125242, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i4 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1142125242, i4, -1, "com.robinhood.compose.app.ShimmerLoadingFragment.ComposeContent.<anonymous> (ShimmerLoadingFragment.kt:46)");
                    }
                    LoadingScreenComposablesKt.ShimmerLoadingComposable(((Args) ShimmerLoadingFragment.INSTANCE.getArgs((Fragment) ShimmerLoadingFragment.this)).getShimmerLoaderType(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer2, ShimmerLoaderType.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.app.ShimmerLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShimmerLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ShimmerLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args;", "Landroid/os/Parcelable;", "shimmerLoaderType", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "navButtonType", "Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;", "<init>", "(Lcom/robinhood/compose/common/ShimmerLoaderType;Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;)V", "getShimmerLoaderType", "()Lcom/robinhood/compose/common/ShimmerLoaderType;", "getNavButtonType", "()Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "NavButtonType", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = ShimmerLoaderType.$stable;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final NavButtonType navButtonType;
        private final ShimmerLoaderType shimmerLoaderType;

        /* compiled from: ShimmerLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ShimmerLoaderType) parcel.readParcelable(Args.class.getClassLoader()), NavButtonType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ShimmerLoaderType shimmerLoaderType, NavButtonType navButtonType, int i, Object obj) {
            if ((i & 1) != 0) {
                shimmerLoaderType = args.shimmerLoaderType;
            }
            if ((i & 2) != 0) {
                navButtonType = args.navButtonType;
            }
            return args.copy(shimmerLoaderType, navButtonType);
        }

        /* renamed from: component1, reason: from getter */
        public final ShimmerLoaderType getShimmerLoaderType() {
            return this.shimmerLoaderType;
        }

        /* renamed from: component2, reason: from getter */
        public final NavButtonType getNavButtonType() {
            return this.navButtonType;
        }

        public final Args copy(ShimmerLoaderType shimmerLoaderType, NavButtonType navButtonType) {
            Intrinsics.checkNotNullParameter(shimmerLoaderType, "shimmerLoaderType");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            return new Args(shimmerLoaderType, navButtonType);
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
            return Intrinsics.areEqual(this.shimmerLoaderType, args.shimmerLoaderType) && this.navButtonType == args.navButtonType;
        }

        public int hashCode() {
            return (this.shimmerLoaderType.hashCode() * 31) + this.navButtonType.hashCode();
        }

        public String toString() {
            return "Args(shimmerLoaderType=" + this.shimmerLoaderType + ", navButtonType=" + this.navButtonType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.shimmerLoaderType, flags);
            dest.writeString(this.navButtonType.name());
        }

        public Args(ShimmerLoaderType shimmerLoaderType, NavButtonType navButtonType) {
            Intrinsics.checkNotNullParameter(shimmerLoaderType, "shimmerLoaderType");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            this.shimmerLoaderType = shimmerLoaderType;
            this.navButtonType = navButtonType;
        }

        public final ShimmerLoaderType getShimmerLoaderType() {
            return this.shimmerLoaderType;
        }

        public /* synthetic */ Args(ShimmerLoaderType shimmerLoaderType, NavButtonType navButtonType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(shimmerLoaderType, (i & 2) != 0 ? NavButtonType.BACK : navButtonType);
        }

        public final NavButtonType getNavButtonType() {
            return this.navButtonType;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShimmerLoadingFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args$NavButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "NONE", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NavButtonType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ NavButtonType[] $VALUES;
            public static final NavButtonType BACK = new NavButtonType("BACK", 0);
            public static final NavButtonType CLOSE = new NavButtonType("CLOSE", 1);
            public static final NavButtonType NONE = new NavButtonType("NONE", 2);

            private static final /* synthetic */ NavButtonType[] $values() {
                return new NavButtonType[]{BACK, CLOSE, NONE};
            }

            public static EnumEntries<NavButtonType> getEntries() {
                return $ENTRIES;
            }

            private NavButtonType(String str, int i) {
            }

            static {
                NavButtonType[] navButtonTypeArr$values = $values();
                $VALUES = navButtonTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(navButtonTypeArr$values);
            }

            public static NavButtonType valueOf(String str) {
                return (NavButtonType) Enum.valueOf(NavButtonType.class, str);
            }

            public static NavButtonType[] values() {
                return (NavButtonType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: ShimmerLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/app/ShimmerLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/compose/app/ShimmerLoadingFragment;", "Lcom/robinhood/compose/app/ShimmerLoadingFragment$Args;", "<init>", "()V", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ShimmerLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ShimmerLoadingFragment shimmerLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, shimmerLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ShimmerLoadingFragment newInstance(Args args) {
            return (ShimmerLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ShimmerLoadingFragment shimmerLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, shimmerLoadingFragment, args);
        }
    }
}
