package com.robinhood.trader.onboarding.region;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoFlagIcon;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.trader.onboarding.C41676R;
import com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: UserCreationRegionSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a£\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a{\u0010\u0013\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u001e\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010\u0014\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"UserCreationRegionSelectorComposable", "", "selectedRegion", "Lcom/robinhood/iso/countrycode/CountryCode;", "filteredRegions", "Lkotlinx/collections/immutable/PersistentList;", "suggestedRegions", "allRegions", "onSearch", "Lkotlin/Function1;", "", "onRegionChange", "onRegionNotListed", "onBack", "Lkotlin/Function0;", "onDone", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/iso/countrycode/CountryCode;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RegionSelectionRows", "input", "(Lcom/robinhood/iso/countrycode/CountryCode;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RegionSelectionRow", "region", "selected", "", "onClick", "(Lcom/robinhood/iso/countrycode/CountryCode;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RegionNotListedRow", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "REGION_SELECTOR_LAZY_COLUMN", "feature-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UserCreationRegionSelectorComposableKt {
    public static final String REGION_SELECTOR_LAZY_COLUMN = "RegionSelectorLazyColumn";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegionNotListedRow$lambda$13(String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RegionNotListedRow(str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegionSelectionRow$lambda$10(CountryCode countryCode, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RegionSelectionRow(countryCode, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegionSelectionRows$lambda$9(CountryCode countryCode, ImmutableList3 immutableList3, ImmutableList3 immutableList32, ImmutableList3 immutableList33, String str, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RegionSelectionRows(countryCode, immutableList3, immutableList32, immutableList33, str, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserCreationRegionSelectorComposable$lambda$0(CountryCode countryCode, ImmutableList3 immutableList3, ImmutableList3 immutableList32, ImmutableList3 immutableList33, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UserCreationRegionSelectorComposable(countryCode, immutableList3, immutableList32, immutableList33, function1, function12, function13, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserCreationRegionSelectorComposable(final CountryCode countryCode, final ImmutableList3<? extends CountryCode> filteredRegions, final ImmutableList3<? extends CountryCode> suggestedRegions, final ImmutableList3<? extends CountryCode> allRegions, final Function1<? super String, Unit> onSearch, final Function1<? super CountryCode, Unit> onRegionChange, final Function1<? super String, Unit> onRegionNotListed, final Function0<Unit> onBack, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(filteredRegions, "filteredRegions");
        Intrinsics.checkNotNullParameter(suggestedRegions, "suggestedRegions");
        Intrinsics.checkNotNullParameter(allRegions, "allRegions");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onRegionChange, "onRegionChange");
        Intrinsics.checkNotNullParameter(onRegionNotListed, "onRegionNotListed");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1835316906);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(countryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(filteredRegions) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(suggestedRegions) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(allRegions) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSearch) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRegionChange) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRegionNotListed) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 == 0) {
            if ((805306368 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835316906, i3, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable (UserCreationRegionSelectorComposable.kt:54)");
                }
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(-1528274406, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1528274406, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous> (UserCreationRegionSelectorComposable.kt:60)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1830672519$feature_onboarding_externalDebug = ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE.getLambda$1830672519$feature_onboarding_externalDebug();
                        final Function0<Unit> function0 = onBack;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1830672519$feature_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(1368449499, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1368449499, i7, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous>.<anonymous> (UserCreationRegionSelectorComposable.kt:69)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(902476059, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(902476059, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous> (UserCreationRegionSelectorComposable.kt:74)");
                        }
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, countryCode != null, false, null, null, null, null, false, null, composer3, 0, 0, 8152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(904956901, true, new C417293(onSearch, countryCode, filteredRegions, suggestedRegions, allRegions, onRegionChange, onRegionNotListed), composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable$lambda$0(countryCode, filteredRegions, suggestedRegions, allRegions, onSearch, onRegionChange, onRegionNotListed, onBack, onDone, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 805306368;
        modifier2 = modifier;
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding2, ComposableLambda3.rememberComposableLambda(-1528274406, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1528274406, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous> (UserCreationRegionSelectorComposable.kt:60)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1830672519$feature_onboarding_externalDebug = ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE.getLambda$1830672519$feature_onboarding_externalDebug();
                    final Function0<Unit> function0 = onBack;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1830672519$feature_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(1368449499, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1368449499, i7, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous>.<anonymous> (UserCreationRegionSelectorComposable.kt:69)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(902476059, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.UserCreationRegionSelectorComposable.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(902476059, i6, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous> (UserCreationRegionSelectorComposable.kt:74)");
                    }
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, countryCode != null, false, null, null, null, null, false, null, composer3, 0, 0, 8152);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(904956901, true, new C417293(onSearch, countryCode, filteredRegions, suggestedRegions, allRegions, onRegionChange, onRegionNotListed), composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: UserCreationRegionSelectorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$UserCreationRegionSelectorComposable$3 */
    static final class C417293 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList3<CountryCode> $allRegions;
        final /* synthetic */ ImmutableList3<CountryCode> $filteredRegions;
        final /* synthetic */ Function1<CountryCode, Unit> $onRegionChange;
        final /* synthetic */ Function1<String, Unit> $onRegionNotListed;
        final /* synthetic */ Function1<String, Unit> $onSearch;
        final /* synthetic */ CountryCode $selectedRegion;
        final /* synthetic */ ImmutableList3<CountryCode> $suggestedRegions;

        /* JADX WARN: Multi-variable type inference failed */
        C417293(Function1<? super String, Unit> function1, CountryCode countryCode, ImmutableList3<? extends CountryCode> immutableList3, ImmutableList3<? extends CountryCode> immutableList32, ImmutableList3<? extends CountryCode> immutableList33, Function1<? super CountryCode, Unit> function12, Function1<? super String, Unit> function13) {
            this.$onSearch = function1;
            this.$selectedRegion = countryCode;
            this.$filteredRegions = immutableList3;
            this.$suggestedRegions = immutableList32;
            this.$allRegions = immutableList33;
            this.$onRegionChange = function12;
            this.$onRegionNotListed = function13;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState invoke$lambda$6$lambda$1$lambda$0() {
            return SnapshotState3.mutableStateOf$default("", null, 2, null);
        }

        private static final String invoke$lambda$6$lambda$2(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904956901, i2, -1, "com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposable.<anonymous> (UserCreationRegionSelectorComposable.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
            final Function1<String, Unit> function1 = this.$onSearch;
            CountryCode countryCode = this.$selectedRegion;
            ImmutableList3<CountryCode> immutableList3 = this.$filteredRegions;
            ImmutableList3<CountryCode> immutableList32 = this.$suggestedRegions;
            ImmutableList3<CountryCode> immutableList33 = this.$allRegions;
            Function1<CountryCode, Unit> function12 = this.$onRegionChange;
            Function1<String, Unit> function13 = this.$onRegionNotListed;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Object[] objArr = new Object[0];
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$UserCreationRegionSelectorComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionSelectorComposableKt.C417293.invoke$lambda$6$lambda$1$lambda$0();
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2);
            String strInvoke$lambda$6$lambda$2 = invoke$lambda$6$lambda$2(snapshotState);
            String strStringResource = StringResources_androidKt.stringResource(C41676R.string.user_creation_region_selector_search, composer, 0);
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState) | composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$UserCreationRegionSelectorComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRegionSelectorComposableKt.C417293.invoke$lambda$6$lambda$5$lambda$4(function1, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoTextInput(strInvoke$lambda$6$lambda$2, (Function1) objRememberedValue2, modifierM21622defaultHorizontalPaddingWMci_g0, null, strStringResource, null, null, size24, null, null, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
            UserCreationRegionSelectorComposableKt.RegionSelectionRows(countryCode, immutableList3, immutableList32, immutableList33, invoke$lambda$6$lambda$2(snapshotState), function12, function13, Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void RegionSelectionRows(final CountryCode countryCode, final ImmutableList3<? extends CountryCode> filteredRegions, final ImmutableList3<? extends CountryCode> suggestedRegions, final ImmutableList3<? extends CountryCode> allRegions, final String input, final Function1<? super CountryCode, Unit> onRegionChange, final Function1<? super String, Unit> onRegionNotListed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(filteredRegions, "filteredRegions");
        Intrinsics.checkNotNullParameter(suggestedRegions, "suggestedRegions");
        Intrinsics.checkNotNullParameter(allRegions, "allRegions");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onRegionChange, "onRegionChange");
        Intrinsics.checkNotNullParameter(onRegionNotListed, "onRegionNotListed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-46518403);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(countryCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(filteredRegions) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(suggestedRegions) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(allRegions) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(input) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRegionChange) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRegionNotListed) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-46518403, i3, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRows (UserCreationRegionSelectorComposable.kt:120)");
            }
            Modifier modifierTestTag = TestTag3.testTag(modifier4, REGION_SELECTOR_LAZY_COLUMN);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((57344 & i3) == 16384) | composerStartRestartGroup.changedInstance(filteredRegions) | composerStartRestartGroup.changedInstance(countryCode) | ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(suggestedRegions) | composerStartRestartGroup.changedInstance(allRegions) | ((i3 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UserCreationRegionSelectorComposableKt.RegionSelectionRows$lambda$8$lambda$7(input, filteredRegions, suggestedRegions, allRegions, countryCode, onRegionChange, onRegionNotListed, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier5 = modifier4;
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserCreationRegionSelectorComposableKt.RegionSelectionRows$lambda$9(countryCode, filteredRegions, suggestedRegions, allRegions, input, onRegionChange, onRegionNotListed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegionSelectionRows$lambda$8$lambda$7(final String str, final ImmutableList3 immutableList3, final ImmutableList3 immutableList32, final ImmutableList3 immutableList33, final CountryCode countryCode, final Function1 function1, final Function1 function12, LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (str.length() > 0) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE.m26530getLambda$190601043$feature_onboarding_externalDebug(), 3, null);
            final C41707x26470852 c41707x26470852 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(CountryCode countryCode2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CountryCode) obj);
                }
            };
            LazyColumn.items(immutableList3.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c41707x26470852.invoke(immutableList3.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final CountryCode countryCode2 = (CountryCode) immutableList3.get(i);
                    composer.startReplaceGroup(1704787516);
                    boolean zAreEqual = Intrinsics.areEqual(countryCode2, countryCode);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(countryCode2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    UserCreationRegionSelectorComposableKt.RegionSelectionRow(countryCode2, zAreEqual, (Function0) objRememberedValue, null, composer, 0, 8);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        } else {
            if (immutableList32.isEmpty()) {
                LazyColumn = lazyListScope;
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE.m26531getLambda$81596134$feature_onboarding_externalDebug(), 3, null);
            } else {
                ComposableSingletons$UserCreationRegionSelectorComposableKt composableSingletons$UserCreationRegionSelectorComposableKt = ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE;
                LazyListScope.item$default(LazyColumn, null, null, composableSingletons$UserCreationRegionSelectorComposableKt.getLambda$531942993$feature_onboarding_externalDebug(), 3, null);
                final C41714x26470856 c41714x26470856 = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(CountryCode countryCode2) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((CountryCode) obj);
                    }
                };
                LazyColumn.items(immutableList32.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c41714x26470856.invoke(immutableList32.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        final CountryCode countryCode2 = (CountryCode) immutableList32.get(i);
                        composer.startReplaceGroup(-1438841720);
                        boolean zAreEqual = Intrinsics.areEqual(countryCode2, countryCode);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode2);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function13 = function1;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$1$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function13.invoke(countryCode2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        UserCreationRegionSelectorComposableKt.RegionSelectionRow(countryCode2, zAreEqual, (Function0) objRememberedValue, null, composer, 0, 8);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                LazyListScope.item$default(LazyColumn, null, null, composableSingletons$UserCreationRegionSelectorComposableKt.getLambda$956976968$feature_onboarding_externalDebug(), 3, null);
                LazyColumn = lazyListScope;
            }
            final C41718x2647085a c41718x2647085a = new Function1() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$9
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(CountryCode countryCode2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CountryCode) obj);
                }
            };
            LazyColumn.items(immutableList33.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c41718x2647085a.invoke(immutableList33.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$lambda$8$lambda$7$$inlined$items$default$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final CountryCode countryCode2 = (CountryCode) immutableList33.get(i);
                    composer.startReplaceGroup(-1747333485);
                    boolean zAreEqual = Intrinsics.areEqual(countryCode2, countryCode);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(countryCode2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(countryCode2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    UserCreationRegionSelectorComposableKt.RegionSelectionRow(countryCode2, zAreEqual, (Function0) objRememberedValue, null, composer, 0, 8);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        if (!immutableList32.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1608810844, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$RegionSelectionRows$1$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1608810844, i, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRows.<anonymous>.<anonymous>.<anonymous> (UserCreationRegionSelectorComposable.kt:181)");
                    }
                    UserCreationRegionSelectorComposableKt.RegionNotListedRow(str, function12, null, composer, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RegionSelectionRow(final CountryCode region, boolean z, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z2 = z;
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1279648636);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(region) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1279648636, i3, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow (UserCreationRegionSelectorComposable.kt:196)");
                }
                z2 = z;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5316selectableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick, 2, null), null, ComposableLambda3.rememberComposableLambda(750806080, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(750806080, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:206)");
                        }
                        BentoRadioButton2.BentoRadioButton(z2, null, false, composer3, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(986975903, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(986975903, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:209)");
                        }
                        BentoText2.m20747BentoText38GnDrw(CountryCode.getDisplayCountry$default(region, null, 1, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1695485372, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695485372, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:212)");
                        }
                        BentoFlagIcon.BentoFlagIcon(region.getIso3166CountryCode(), null, composer3, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1576320, 0, 1970);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UserCreationRegionSelectorComposableKt.RegionSelectionRow$lambda$10(region, z2, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z2 = z;
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(Selectable3.m5316selectableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick, 2, null), null, ComposableLambda3.rememberComposableLambda(750806080, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(750806080, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:206)");
                    }
                    BentoRadioButton2.BentoRadioButton(z2, null, false, composer3, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(986975903, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(986975903, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:209)");
                    }
                    BentoText2.m20747BentoText38GnDrw(CountryCode.getDisplayCountry$default(region, null, 1, null), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1695485372, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt.RegionSelectionRow.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695485372, i5, -1, "com.robinhood.trader.onboarding.region.RegionSelectionRow.<anonymous> (UserCreationRegionSelectorComposable.kt:212)");
                    }
                    BentoFlagIcon.BentoFlagIcon(region.getIso3166CountryCode(), null, composer3, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1576320, 0, 1970);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RegionNotListedRow(final String input, final Function1<? super String, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2027852899);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(input) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2027852899, i3, -1, "com.robinhood.trader.onboarding.region.RegionNotListedRow (UserCreationRegionSelectorComposable.kt:222)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserCreationRegionSelectorComposableKt.RegionNotListedRow$lambda$12$lambda$11(onClick, input);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null);
                ComposableSingletons$UserCreationRegionSelectorComposableKt composableSingletons$UserCreationRegionSelectorComposableKt = ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default, null, composableSingletons$UserCreationRegionSelectorComposableKt.m26528getLambda$1123146465$feature_onboarding_externalDebug(), composableSingletons$UserCreationRegionSelectorComposableKt.m26529getLambda$1827009440$feature_onboarding_externalDebug(), null, null, null, false, false, false, null, composer2, 3456, 0, 2034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UserCreationRegionSelectorComposableKt.RegionNotListedRow$lambda$13(input, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z = ((i3 & 112) != 32) | ((i3 & 14) == 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.trader.onboarding.region.UserCreationRegionSelectorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserCreationRegionSelectorComposableKt.RegionNotListedRow$lambda$12$lambda$11(onClick, input);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (Function0) objRememberedValue, 7, null);
                ComposableSingletons$UserCreationRegionSelectorComposableKt composableSingletons$UserCreationRegionSelectorComposableKt2 = ComposableSingletons$UserCreationRegionSelectorComposableKt.INSTANCE;
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM4893clickableXHw0xAI$default2, null, composableSingletons$UserCreationRegionSelectorComposableKt2.m26528getLambda$1123146465$feature_onboarding_externalDebug(), composableSingletons$UserCreationRegionSelectorComposableKt2.m26529getLambda$1827009440$feature_onboarding_externalDebug(), null, null, null, false, false, false, null, composer2, 3456, 0, 2034);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegionNotListedRow$lambda$12$lambda$11(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}
