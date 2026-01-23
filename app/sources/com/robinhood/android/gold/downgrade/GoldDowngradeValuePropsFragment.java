package com.robinhood.android.gold.downgrade;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: GoldDowngradeValuePropsFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldDowngradeValuePropsFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldDowngradeValuePropsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldDowngradeValuePropsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldDowngradeValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Callbacks;", "", "onProceedWithDowngrade", "", "onAbortDowngrade", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAbortDowngrade();

        void onProceedWithDowngrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldDowngradeValuePropsFragment goldDowngradeValuePropsFragment, int i, Composer composer, int i2) {
        goldDowngradeValuePropsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1194330298);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1194330298, i2, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent (GoldDowngradeValuePropsFragment.kt:32)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1584621265, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1584621265, i3, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.<anonymous> (GoldDowngradeValuePropsFragment.kt:34)");
                    }
                    final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-899417963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-899417963, i4, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.<anonymous>.<anonymous> (GoldDowngradeValuePropsFragment.kt:38)");
                            }
                            Function2<Composer, Integer, Unit> lambda$858985538$feature_gold_downgrade_externalDebug = GoldDowngradeValuePropsFragment2.INSTANCE.getLambda$858985538$feature_gold_downgrade_externalDebug();
                            final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$858985538$feature_gold_downgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1149379946, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i5 & 6) == 0) {
                                        i5 |= (i5 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1149379946, i5, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (GoldDowngradeValuePropsFragment.kt:41)");
                                    }
                                    AppCompatActivity appCompatActivity2 = appCompatActivity;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer4.changedInstance(appCompatActivity2);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new GoldDowngradeValuePropsFragment4(appCompatActivity2);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final GoldDowngradeValuePropsFragment goldDowngradeValuePropsFragment = GoldDowngradeValuePropsFragment.this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(2022144800, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2022144800, i4, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment.ComposeContent.<anonymous>.<anonymous> (GoldDowngradeValuePropsFragment.kt:48)");
                            }
                            ApiGoldValuePropsDowngrade valueProps = ((Args) GoldDowngradeValuePropsFragment.INSTANCE.getArgs((Fragment) goldDowngradeValuePropsFragment)).getGoldDowngradeContext().getValueProps();
                            Callbacks callbacks = goldDowngradeValuePropsFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(callbacks);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldDowngradeValuePropsFragment5(callbacks);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            Callbacks callbacks2 = goldDowngradeValuePropsFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(callbacks2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new GoldDowngradeValuePropsFragment6(callbacks2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            GoldDowngradeValuePropsFragmentComposable.GoldDowngradeValuePropsComposable(valueProps, function0, (Function0) ((KFunction) objRememberedValue2), PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeValuePropsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDowngradeValuePropsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldDowngradeValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Args;", "Landroid/os/Parcelable;", "goldDowngradeContext", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "<init>", "(Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;)V", "getGoldDowngradeContext", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final GoldDowngradeContext goldDowngradeContext;

        /* compiled from: GoldDowngradeValuePropsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(GoldDowngradeContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, GoldDowngradeContext goldDowngradeContext, int i, Object obj) {
            if ((i & 1) != 0) {
                goldDowngradeContext = args.goldDowngradeContext;
            }
            return args.copy(goldDowngradeContext);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldDowngradeContext getGoldDowngradeContext() {
            return this.goldDowngradeContext;
        }

        public final Args copy(GoldDowngradeContext goldDowngradeContext) {
            Intrinsics.checkNotNullParameter(goldDowngradeContext, "goldDowngradeContext");
            return new Args(goldDowngradeContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.goldDowngradeContext, ((Args) other).goldDowngradeContext);
        }

        public int hashCode() {
            return this.goldDowngradeContext.hashCode();
        }

        public String toString() {
            return "Args(goldDowngradeContext=" + this.goldDowngradeContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.goldDowngradeContext.writeToParcel(dest, flags);
        }

        public Args(GoldDowngradeContext goldDowngradeContext) {
            Intrinsics.checkNotNullParameter(goldDowngradeContext, "goldDowngradeContext");
            this.goldDowngradeContext = goldDowngradeContext;
        }

        public final GoldDowngradeContext getGoldDowngradeContext() {
            return this.goldDowngradeContext;
        }
    }

    /* compiled from: GoldDowngradeValuePropsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeValuePropsFragment$Args;", "<init>", "()V", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldDowngradeValuePropsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldDowngradeValuePropsFragment goldDowngradeValuePropsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldDowngradeValuePropsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldDowngradeValuePropsFragment newInstance(Args args) {
            return (GoldDowngradeValuePropsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldDowngradeValuePropsFragment goldDowngradeValuePropsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldDowngradeValuePropsFragment, args);
        }
    }
}
