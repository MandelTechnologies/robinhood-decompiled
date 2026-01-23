package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FlexGrid.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001as\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"T", "Lkotlinx/collections/immutable/ImmutableList;", "items", "Landroidx/compose/ui/Modifier;", "modifier", "rowModifier", "", "minRow", "maxRow", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "rowHorizontalArrangement", "Lkotlin/Function1;", "", "itemContent", "FlexGrid", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;IILandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlexGridPreview3", "(Landroidx/compose/runtime/Composer;I)V", "FlexGridPreview4", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FlexGrid4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlexGrid$lambda$4(ImmutableList immutableList, Modifier modifier, Modifier modifier2, int i, int i2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function3 function3, int i3, int i4, Composer composer, int i5) {
        FlexGrid(immutableList, modifier, modifier2, i, i2, vertical, horizontal, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlexGridPreview3$lambda$5(int i, Composer composer, int i2) {
        FlexGridPreview3(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlexGridPreview4$lambda$6(int i, Composer composer, int i2) {
        FlexGridPreview4(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void FlexGrid(final ImmutableList<? extends T> items, Modifier modifier, Modifier modifier2, int i, int i2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, final Function3<? super T, ? super Composer, ? super Integer, Unit> itemContent, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier3;
        int i6;
        Modifier modifier4;
        int i7;
        int i8;
        int i9;
        int i10;
        Arrangement.Vertical top;
        int i11;
        Arrangement.Horizontal spaceEvenly;
        int i12;
        int i13;
        boolean z;
        Object objRememberedValue;
        final ImmutableList immutableList;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier modifier5;
        Composer composer2;
        final Modifier modifier6;
        final Arrangement.Horizontal horizontal2;
        final Modifier modifier7;
        final int i14;
        final int i15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1559235252);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? composerStartRestartGroup.changed(items) : composerStartRestartGroup.changedInstance(items) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier3 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier3) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    modifier4 = modifier2;
                    i5 |= composerStartRestartGroup.changed(modifier4) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 != 0) {
                        if ((i3 & 24576) == 0) {
                            i9 = i2;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            top = vertical;
                        } else {
                            top = vertical;
                            if ((i3 & 196608) == 0) {
                                i5 |= composerStartRestartGroup.changed(top) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            spaceEvenly = horizontal;
                        } else {
                            spaceEvenly = horizontal;
                            if ((i3 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(spaceEvenly) ? 1048576 : 524288;
                            }
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(itemContent) ? 8388608 : 4194304;
                        }
                        if ((i5 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i16 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                modifier4 = Modifier.INSTANCE;
                            }
                            i12 = i7 == 0 ? 2 : i;
                            i13 = i8 == 0 ? 3 : i9;
                            if (i10 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            }
                            if (i11 != 0) {
                                spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1559235252, i5, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.FlexGrid (FlexGrid.kt:32)");
                            }
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i17 = i5 & 14;
                            z = ((i5 & 7168) != 2048) | (i17 != 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changed(items))) | ((57344 & i5) != 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = FlexChunk.flexChunk(items.size(), i12, i13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            immutableList = (ImmutableList) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            int i18 = i12;
                            zChangedInstance = ((i5 & 896) != 256) | composerStartRestartGroup.changedInstance(immutableList) | ((3670016 & i5) != 1048576) | ((29360128 & i5) != 8388608) | (i17 != 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(items)));
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final Arrangement.Horizontal horizontal3 = spaceEvenly;
                                final Modifier modifier8 = modifier4;
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FlexGrid4.FlexGrid$lambda$3$lambda$2(immutableList, modifier8, horizontal3, itemContent, items, (LazyListScope) obj);
                                    }
                                };
                                modifier5 = modifier8;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                modifier5 = modifier4;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i19 = i5 >> 3;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier9 = modifier3;
                            LazyDslKt.LazyColumn(modifier9, null, null, false, top, centerHorizontally, null, false, null, (Function1) objRememberedValue2, composer2, (i19 & 14) | 196608 | (i19 & 57344), 462);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier6 = modifier5;
                            horizontal2 = spaceEvenly;
                            modifier7 = modifier9;
                            i14 = i13;
                            i15 = i18;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i15 = i;
                            composer2 = composerStartRestartGroup;
                            modifier7 = modifier3;
                            modifier6 = modifier4;
                            horizontal2 = spaceEvenly;
                            i14 = i9;
                        }
                        final Arrangement.Vertical vertical2 = top;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return FlexGrid4.FlexGrid$lambda$4(items, modifier7, modifier6, i15, i14, vertical2, horizontal2, itemContent, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    i9 = i2;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if ((i5 & 4793491) != 4793490) {
                        if (i16 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        int i172 = i5 & 14;
                        if (i172 != 4) {
                            z = ((i5 & 7168) != 2048) | (i172 != 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changed(items))) | ((57344 & i5) != 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue = FlexChunk.flexChunk(items.size(), i12, i13);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                immutableList = (ImmutableList) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                int i182 = i12;
                                if (i172 != 4) {
                                    zChangedInstance = ((i5 & 896) != 256) | composerStartRestartGroup.changedInstance(immutableList) | ((3670016 & i5) != 1048576) | ((29360128 & i5) != 8388608) | (i172 != 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(items)));
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance) {
                                        final Arrangement.Horizontal horizontal32 = spaceEvenly;
                                        final Modifier modifier82 = modifier4;
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return FlexGrid4.FlexGrid$lambda$3$lambda$2(immutableList, modifier82, horizontal32, itemContent, items, (LazyListScope) obj);
                                            }
                                        };
                                        modifier5 = modifier82;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceGroup();
                                        int i192 = i5 >> 3;
                                        composer2 = composerStartRestartGroup;
                                        Modifier modifier92 = modifier3;
                                        LazyDslKt.LazyColumn(modifier92, null, null, false, top, centerHorizontally2, null, false, null, (Function1) objRememberedValue2, composer2, (i192 & 14) | 196608 | (i192 & 57344), 462);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier6 = modifier5;
                                        horizontal2 = spaceEvenly;
                                        modifier7 = modifier92;
                                        i14 = i13;
                                        i15 = i182;
                                    }
                                }
                            }
                        }
                    }
                    final Arrangement.Vertical vertical22 = top;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                }
                i9 = i2;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if ((i5 & 4793491) != 4793490) {
                }
                final Arrangement.Vertical vertical222 = top;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier4 = modifier2;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i2;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((i5 & 4793491) != 4793490) {
            }
            final Arrangement.Vertical vertical2222 = top;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier4 = modifier2;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i5 & 4793491) != 4793490) {
        }
        final Arrangement.Vertical vertical22222 = top;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void FlexGridPreview3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(137634525);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(137634525, i, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridPreview3 (FlexGrid.kt:59)");
            }
            ImmutableList immutableList = extensions2.toImmutableList(new PrimitiveRanges2(1, 7));
            Modifier.Companion companion = Modifier.INSTANCE;
            FlexGrid(immutableList, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 2, 3, Arrangement.INSTANCE.getTop(), null, FlexGrid.INSTANCE.getLambda$1608626051$feature_equity_detail_externalDebug(), composerStartRestartGroup, 12807600, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlexGrid4.FlexGridPreview3$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FlexGridPreview4(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-391284514);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391284514, i, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridPreview4 (FlexGrid.kt:73)");
            }
            FlexGrid(extensions2.toImmutableList(new PrimitiveRanges2(1, 7)), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 2, 4, Arrangement.INSTANCE.getTop(), null, FlexGrid.INSTANCE.getLambda$1079707012$feature_equity_detail_externalDebug(), composerStartRestartGroup, 12807216, 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlexGrid4.FlexGridPreview4$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlexGrid$lambda$3$lambda$2(ImmutableList immutableList, final Modifier modifier, final Arrangement.Horizontal horizontal, final Function3 function3, final ImmutableList immutableList2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            final PrimitiveRanges2 primitiveRanges2 = (PrimitiveRanges2) it.next();
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-8242060, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.FlexGridKt$FlexGrid$1$1$1$1
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
                        ComposerKt.traceEventStart(-8242060, i, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.FlexGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlexGrid.kt:43)");
                    }
                    Modifier modifier2 = modifier;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    PrimitiveRanges2 primitiveRanges22 = primitiveRanges2;
                    Function3<T, Composer, Integer, Unit> function32 = function3;
                    List list = immutableList2;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontal2, Alignment.INSTANCE.getTop(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier2);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composer.startReplaceGroup(-1919575958);
                    Iterator<Integer> it2 = primitiveRanges22.iterator();
                    while (it2.hasNext()) {
                        function32.invoke(list.get(((PrimitiveIterators6) it2).nextInt()), composer, 0);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }
}
