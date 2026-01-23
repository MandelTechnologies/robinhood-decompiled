package com.robinhood.android.odyssey.lib.template.citizen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable;
import com.robinhood.android.odyssey.lib.view.SdTypedIcon2;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SdSearchCitizenSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aC\u0010\u0012\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001a5\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"SdSearchCitizenSelectorComposable", "", "title", "", "placeholder", "selectedOption", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "selectableOptions", "Lkotlinx/collections/immutable/PersistentList;", "onSearch", "Lkotlin/Function1;", "onSelectChange", "onBack", "Lkotlin/Function0;", "onDone", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CitizenSelectionRows", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CitizenSelectionRow", "citizen", "selected", "", "onClick", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-odyssey_externalDebug", "input"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdSearchCitizenSelectorComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CitizenSelectionRow$lambda$8(ApiSdOption apiSdOption, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CitizenSelectionRow(apiSdOption, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CitizenSelectionRows$lambda$6(ApiSdOption apiSdOption, ImmutableList3 immutableList3, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CitizenSelectionRows(apiSdOption, immutableList3, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdSearchCitizenSelectorComposable$lambda$0(String str, String str2, ApiSdOption apiSdOption, ImmutableList3 immutableList3, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SdSearchCitizenSelectorComposable(str, str2, apiSdOption, immutableList3, function1, function12, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SdSearchCitizenSelectorComposable(final String str, final String str2, final ApiSdOption apiSdOption, final ImmutableList3<ApiSdOption> selectableOptions, final Function1<? super String, Unit> onSearch, final Function1<? super ApiSdOption, Unit> onSelectChange, final Function0<Unit> onBack, final Function0<Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        Modifier modifier2;
        int i5;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectableOptions, "selectableOptions");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(1361559101);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(apiSdOption) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(selectableOptions) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSearch) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSelectChange) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBack) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDone) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
                }
                i5 = i3;
                if ((38347923 & i5) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1361559101, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable (SdSearchCitizenSelectorComposable.kt:48)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(347988225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(347988225, i7, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous> (SdSearchCitizenSelectorComposable.kt:53)");
                            }
                            final String str4 = str;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(398135278, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(398135278, i8, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:55)");
                                    }
                                    String strStringResource = str4;
                                    composer4.startReplaceGroup(355914927);
                                    if (strStringResource == null) {
                                        strStringResource = StringResources_androidKt.stringResource(C20335R.string.citizen_select_input_title, composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            final Function0<Unit> function0 = onBack;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1774783298, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1774783298, i8, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:60)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-653067646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-653067646, i7, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous> (SdSearchCitizenSelectorComposable.kt:66)");
                            }
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                            BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, apiSdOption != null, false, null, null, null, null, false, null, composer3, 0, 0, 8152);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(867606092, true, new C227013(str3, onSearch, apiSdOption, selectableOptions, onSelectChange), composerStartRestartGroup, 54), composer2, ((i5 >> 24) & 14) | 805306800, EnumC7081g.f2774x74902ae0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SdSearchCitizenSelectorComposable.SdSearchCitizenSelectorComposable$lambda$0(str, str2, apiSdOption, selectableOptions, onSearch, onSelectChange, onBack, onDone, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 100663296;
            modifier2 = modifier;
            i5 = i3;
            if ((38347923 & i5) == 38347922) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(347988225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(347988225, i7, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous> (SdSearchCitizenSelectorComposable.kt:53)");
                        }
                        final String str4 = str;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(398135278, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(398135278, i8, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:55)");
                                }
                                String strStringResource = str4;
                                composer4.startReplaceGroup(355914927);
                                if (strStringResource == null) {
                                    strStringResource = StringResources_androidKt.stringResource(C20335R.string.citizen_select_input_title, composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        final Function0<Unit> function0 = onBack;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1774783298, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1774783298, i8, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:60)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-653067646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.SdSearchCitizenSelectorComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-653067646, i7, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous> (SdSearchCitizenSelectorComposable.kt:66)");
                        }
                        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        BentoButtonKt.m20586BentoButtonEikTQX8(onDone, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer3, 0), modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, apiSdOption != null, false, null, null, null, null, false, null, composer3, 0, 0, 8152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(867606092, true, new C227013(str3, onSearch, apiSdOption, selectableOptions, onSelectChange), composerStartRestartGroup, 54), composer2, ((i5 >> 24) & 14) | 805306800, EnumC7081g.f2774x74902ae0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((38347923 & i5) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: SdSearchCitizenSelectorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$SdSearchCitizenSelectorComposable$3 */
    static final class C227013 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onSearch;
        final /* synthetic */ Function1<ApiSdOption, Unit> $onSelectChange;
        final /* synthetic */ String $placeholder;
        final /* synthetic */ ImmutableList3<ApiSdOption> $selectableOptions;
        final /* synthetic */ ApiSdOption $selectedOption;

        /* JADX WARN: Multi-variable type inference failed */
        C227013(String str, Function1<? super String, Unit> function1, ApiSdOption apiSdOption, ImmutableList3<ApiSdOption> immutableList3, Function1<? super ApiSdOption, Unit> function12) {
            this.$placeholder = str;
            this.$onSearch = function1;
            this.$selectedOption = apiSdOption;
            this.$selectableOptions = immutableList3;
            this.$onSelectChange = function12;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        private static final String invoke$lambda$6$lambda$2(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
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
                ComposerKt.traceEventStart(867606092, i2, -1, "com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposable.<anonymous> (SdSearchCitizenSelectorComposable.kt:75)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
            String strStringResource = this.$placeholder;
            final Function1<String, Unit> function1 = this.$onSearch;
            ApiSdOption apiSdOption = this.$selectedOption;
            ImmutableList3<ApiSdOption> immutableList3 = this.$selectableOptions;
            Function1<ApiSdOption, Unit> function12 = this.$onSelectChange;
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
                objRememberedValue = new Function0() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$SdSearchCitizenSelectorComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SdSearchCitizenSelectorComposable.C227013.invoke$lambda$6$lambda$1$lambda$0();
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2);
            String strInvoke$lambda$6$lambda$2 = invoke$lambda$6$lambda$2(snapshotState);
            composer.startReplaceGroup(1141795294);
            if (strStringResource == null) {
                strStringResource = StringResources_androidKt.stringResource(C20335R.string.citizen_select_input_search, composer, 0);
            }
            composer.endReplaceGroup();
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState) | composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$SdSearchCitizenSelectorComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdSearchCitizenSelectorComposable.C227013.invoke$lambda$6$lambda$5$lambda$4(function1, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoTextInput(strInvoke$lambda$6$lambda$2, (Function1) objRememberedValue2, modifierM21622defaultHorizontalPaddingWMci_g0, null, strStringResource, null, null, size24, null, null, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
            SdSearchCitizenSelectorComposable.CitizenSelectionRows(apiSdOption, immutableList3, function12, Column5.weight$default(column6, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CitizenSelectionRows(final ApiSdOption apiSdOption, final ImmutableList3<ApiSdOption> selectableOptions, final Function1<? super ApiSdOption, Unit> onSelectChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectableOptions, "selectableOptions");
        Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1883453376);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(apiSdOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(selectableOptions) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectChange) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1883453376, i3, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRows (SdSearchCitizenSelectorComposable.kt:107)");
                }
                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(selectableOptions) | composerStartRestartGroup.changedInstance(apiSdOption);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SdSearchCitizenSelectorComposable.CitizenSelectionRows$lambda$4$lambda$3(selectableOptions, apiSdOption, onSelectChange, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 9) & 14;
                Modifier modifier3 = modifier2;
                LazyDslKt.LazyColumn(modifier3, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i5, 508);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(selectableOptions) | composerStartRestartGroup.changedInstance(apiSdOption) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SdSearchCitizenSelectorComposable4(selectableOptions, apiSdOption, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SdSearchCitizenSelectorComposable.CitizenSelectionRows$lambda$6(apiSdOption, selectableOptions, onSelectChange, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(selectableOptions) | composerStartRestartGroup.changedInstance(apiSdOption);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SdSearchCitizenSelectorComposable.CitizenSelectionRows$lambda$4$lambda$3(selectableOptions, apiSdOption, onSelectChange, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (i3 >> 9) & 14;
                Modifier modifier32 = modifier2;
                LazyDslKt.LazyColumn(modifier32, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i52, 508);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(selectableOptions) | composerStartRestartGroup.changedInstance(apiSdOption) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new SdSearchCitizenSelectorComposable4(selectableOptions, apiSdOption, lazyListStateRememberLazyListState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CitizenSelectionRow(final ApiSdOption citizen, boolean z, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z2 = z;
        Intrinsics.checkNotNullParameter(citizen, "citizen");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-641921309);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(citizen) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-641921309, i3, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow (SdSearchCitizenSelectorComposable.kt:135)");
                }
                Modifier modifierM5316selectableXHw0xAI$default = Selectable3.m5316selectableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick, 2, null);
                z2 = z;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1110469287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.CitizenSelectionRow.1
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
                            ComposerKt.traceEventStart(1110469287, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous> (SdSearchCitizenSelectorComposable.kt:145)");
                        }
                        BentoRadioButton2.BentoRadioButton(z2, null, false, composer3, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(873851462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.CitizenSelectionRow.2
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
                            ComposerKt.traceEventStart(873851462, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous> (SdSearchCitizenSelectorComposable.kt:148)");
                        }
                        BentoText2.m20747BentoText38GnDrw(citizen.getDisplay_label(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                final ApiSdTypedIcon typed_icon_object = citizen.getTyped_icon_object();
                composerStartRestartGroup.startReplaceGroup(1588932146);
                ComposableLambda composableLambdaRememberComposableLambda3 = typed_icon_object != null ? ComposableLambda3.rememberComposableLambda(-217389899, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRow$3$1
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
                            ComposerKt.traceEventStart(-217389899, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:151)");
                        }
                        SdTypedIcon2.SdTypedIcon(typed_icon_object, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(modifierM5316selectableXHw0xAI$default, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, composableLambdaRememberComposableLambda3, false, false, false, null, composer2, 3456, 0, 1970);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SdSearchCitizenSelectorComposable.CitizenSelectionRow$lambda$8(citizen, z2, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM5316selectableXHw0xAI$default2 = Selectable3.m5316selectableXHw0xAI$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), onClick, 2, null);
            z2 = z;
            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(1110469287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.CitizenSelectionRow.1
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
                        ComposerKt.traceEventStart(1110469287, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous> (SdSearchCitizenSelectorComposable.kt:145)");
                    }
                    BentoRadioButton2.BentoRadioButton(z2, null, false, composer3, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(873851462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt.CitizenSelectionRow.2
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
                        ComposerKt.traceEventStart(873851462, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous> (SdSearchCitizenSelectorComposable.kt:148)");
                    }
                    BentoText2.m20747BentoText38GnDrw(citizen.getDisplay_label(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            final ApiSdTypedIcon typed_icon_object2 = citizen.getTyped_icon_object();
            composerStartRestartGroup.startReplaceGroup(1588932146);
            ComposableLambda composableLambdaRememberComposableLambda32 = typed_icon_object2 != null ? ComposableLambda3.rememberComposableLambda(-217389899, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRow$3$1
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
                        ComposerKt.traceEventStart(-217389899, i5, -1, "com.robinhood.android.odyssey.lib.template.citizen.CitizenSelectionRow.<anonymous>.<anonymous> (SdSearchCitizenSelectorComposable.kt:151)");
                    }
                    SdTypedIcon2.SdTypedIcon(typed_icon_object2, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM5316selectableXHw0xAI$default2, null, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda22, null, null, composableLambdaRememberComposableLambda32, false, false, false, null, composer2, 3456, 0, 1970);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CitizenSelectionRows$lambda$4$lambda$3(final ImmutableList3 immutableList3, final ApiSdOption apiSdOption, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C22690x547c9835 c22690x547c9835 = new Function1() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ApiSdOption apiSdOption2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ApiSdOption) obj);
            }
        };
        LazyColumn.items(immutableList3.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c22690x547c9835.invoke(immutableList3.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$lambda$4$lambda$3$$inlined$items$default$4
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
                final ApiSdOption apiSdOption2 = (ApiSdOption) immutableList3.get(i);
                composer.startReplaceGroup(-1260307520);
                boolean zAreEqual = Intrinsics.areEqual(apiSdOption2, apiSdOption);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(apiSdOption2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.odyssey.lib.template.citizen.SdSearchCitizenSelectorComposableKt$CitizenSelectionRows$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(apiSdOption2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SdSearchCitizenSelectorComposable.CitizenSelectionRow(apiSdOption2, zAreEqual, (Function0) objRememberedValue, null, composer, 0, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
