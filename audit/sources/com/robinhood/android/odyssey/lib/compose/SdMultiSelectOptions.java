package com.robinhood.android.odyssey.lib.compose;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSelectionConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SdMultiSelectOptions.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"SdMultiSelectOptions", "", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "maxSelections", "", "checkboxPosition", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;", "exclusionRules", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$ExclusionRule;", "onOptionToggled", "Lkotlin/Function3;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;ILcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdMultiSelectOptions {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdMultiSelectOptions$lambda$8(ImmutableList immutableList, int i, ApiSelectionConfig.CheckboxPosition checkboxPosition, ImmutableList immutableList2, Function3 function3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        SdMultiSelectOptions(immutableList, i, checkboxPosition, immutableList2, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SdMultiSelectOptions(final ImmutableList<ApiSdOption> options, final int i, final ApiSelectionConfig.CheckboxPosition checkboxPosition, final ImmutableList<ApiSelectionConfig.ExclusionRule> immutableList, final Function3<? super ApiSdOption, ? super Boolean, ? super Integer, Unit> onOptionToggled, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotStateSet snapshotStateSet;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(checkboxPosition, "checkboxPosition");
        Intrinsics.checkNotNullParameter(onOptionToggled, "onOptionToggled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041041910);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(options) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(checkboxPosition.ordinal()) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(immutableList) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onOptionToggled) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i7 = i4;
                if ((74899 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1041041910, i7, -1, "com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptions (SdMultiSelectOptions.kt:20)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateSetOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotStateSet = (SnapshotStateSet) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i7 & 112) != 32) | composerStartRestartGroup.changedInstance(options) | composerStartRestartGroup.changedInstance(immutableList) | ((i7 & 896) != 256) | ((57344 & i7) == 16384);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        final int i8 = i5;
                        Function1 function1 = new Function1() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SdMultiSelectOptions.SdMultiSelectOptions$lambda$7$lambda$6(options, immutableList, snapshotStateSet, i8, checkboxPosition, onOptionToggled, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier4 = modifier2;
                    LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i7 >> 15) & 14, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SdMultiSelectOptions.SdMultiSelectOptions$lambda$8(options, i, checkboxPosition, immutableList, onOptionToggled, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 196608;
            modifier2 = modifier;
            i7 = i4;
            if ((74899 & i7) == 74898) {
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotStateSet = (SnapshotStateSet) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i7 & 112) != 32) | composerStartRestartGroup.changedInstance(options) | composerStartRestartGroup.changedInstance(immutableList) | ((i7 & 896) != 256) | ((57344 & i7) == 16384);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    final int i82 = i5;
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SdMultiSelectOptions.SdMultiSelectOptions$lambda$7$lambda$6(options, immutableList, snapshotStateSet, i82, checkboxPosition, onOptionToggled, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue2 = function12;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = modifier2;
                    LazyDslKt.LazyColumn(modifier42, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i7 >> 15) & 14, 510);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        modifier2 = modifier;
        i7 = i4;
        if ((74899 & i7) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdMultiSelectOptions$lambda$7$lambda$6(final ImmutableList immutableList, final ImmutableList immutableList2, final SnapshotStateSet snapshotStateSet, final int i, final ApiSelectionConfig.CheckboxPosition checkboxPosition, final Function3 function3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C22633xb9db9b7 c22633xb9db9b7 = new Function1() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$SdMultiSelectOptions$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ApiSdOption apiSdOption) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ApiSdOption) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$SdMultiSelectOptions$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return c22633xb9db9b7.invoke(immutableList.get(i2));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$SdMultiSelectOptions$lambda$7$lambda$6$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                boolean zContains;
                ImmutableList<String> mutually_exclusive_with;
                ImmutableList<String> mutually_exclusive_with2;
                int i4 = (i3 & 6) == 0 ? (composer.changed(lazyItemScope) ? 4 : 2) | i3 : i3;
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final ApiSdOption apiSdOption = (ApiSdOption) immutableList.get(i2);
                composer.startReplaceGroup(-1487722608);
                ImmutableList immutableList3 = immutableList2;
                Object obj = null;
                if (immutableList3 != null) {
                    Iterator<E> it = immutableList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        ApiSelectionConfig.ExclusionRule exclusionRule = (ApiSelectionConfig.ExclusionRule) next;
                        if (Intrinsics.areEqual(exclusionRule.getOption_key(), apiSdOption.getKey()) && (((mutually_exclusive_with2 = exclusionRule.getMutually_exclusive_with()) == null || mutually_exclusive_with2.isEmpty()) && snapshotStateSet.contains(apiSdOption.getKey()))) {
                            if (snapshotStateSet.size() > 1) {
                            }
                        } else if (!Intrinsics.areEqual(exclusionRule.getOption_key(), apiSdOption.getKey()) || (!((mutually_exclusive_with = exclusionRule.getMutually_exclusive_with()) == null || mutually_exclusive_with.isEmpty()) || snapshotStateSet.contains(apiSdOption.getKey()))) {
                            if (Intrinsics.areEqual(exclusionRule.getOption_key(), apiSdOption.getKey())) {
                                ImmutableList<String> mutually_exclusive_with3 = exclusionRule.getMutually_exclusive_with();
                                if (mutually_exclusive_with3 != null && !mutually_exclusive_with3.isEmpty()) {
                                    Iterator<String> it2 = mutually_exclusive_with3.iterator();
                                    while (it2.hasNext()) {
                                        if (snapshotStateSet.contains(it2.next())) {
                                            zContains = true;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                ImmutableList<String> mutually_exclusive_with4 = exclusionRule.getMutually_exclusive_with();
                                if (mutually_exclusive_with4 != null && !mutually_exclusive_with4.isEmpty()) {
                                    ImmutableList<String> mutually_exclusive_with5 = exclusionRule.getMutually_exclusive_with();
                                    if (mutually_exclusive_with5 != null && !mutually_exclusive_with5.isEmpty()) {
                                        for (String str : mutually_exclusive_with5) {
                                            if (snapshotStateSet.contains(apiSdOption.getKey())) {
                                            }
                                        }
                                    }
                                }
                                zContains = snapshotStateSet.contains(exclusionRule.getOption_key());
                                break;
                            }
                            zContains = false;
                        } else {
                            if (!snapshotStateSet.isEmpty()) {
                                zContains = true;
                                break;
                                break;
                            }
                            zContains = false;
                        }
                        if (zContains) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (ApiSelectionConfig.ExclusionRule) obj;
                }
                boolean z = !(obj != null) && (snapshotStateSet.contains(apiSdOption.getKey()) || snapshotStateSet.size() < i);
                boolean zContains2 = snapshotStateSet.contains(apiSdOption.getKey());
                ApiSelectionConfig.CheckboxPosition checkboxPosition2 = checkboxPosition;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(apiSdOption) | composer.changed(function3) | composer.changed(i);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotStateSet snapshotStateSet2 = snapshotStateSet;
                    final Function3 function32 = function3;
                    final int i5 = i;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptionsKt$SdMultiSelectOptions$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (snapshotStateSet2.contains(apiSdOption.getKey())) {
                                snapshotStateSet2.remove(apiSdOption.getKey());
                                function32.invoke(apiSdOption, Boolean.FALSE, Integer.valueOf(snapshotStateSet2.size()));
                            } else if (snapshotStateSet2.size() < i5) {
                                snapshotStateSet2.add(apiSdOption.getKey());
                                function32.invoke(apiSdOption, Boolean.TRUE, Integer.valueOf(snapshotStateSet2.size()));
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SdMultiSelectOptionRow.SdMultiSelectOptionRow(zContains2, z, apiSdOption, checkboxPosition2, (Function0) objRememberedValue, null, composer, 0, 32);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
