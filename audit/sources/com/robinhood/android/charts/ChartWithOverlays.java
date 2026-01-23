package com.robinhood.android.charts;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.overlay.Overlays2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartWithOverlays.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"ChartWithOverlays", "", "modifier", "Landroidx/compose/ui/Modifier;", "annotations", "", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "overlays", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "scrubListener", "Lcom/robinhood/android/charts/ScrubListener;", "showPlaceholder", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/charts/ScrubListener;ZLandroidx/compose/runtime/Composer;II)V", "longPressTimeoutMillis", "", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/android/charts/model/Point;", "onScrubStopped", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "DEFAULT_LONG_PRESS_TIMEOUT_MS", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.ChartWithOverlaysKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartWithOverlays {
    public static final long DEFAULT_LONG_PRESS_TIMEOUT_MS = 200;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartWithOverlays$lambda$1(Modifier modifier, List list, List list2, Interactions5 interactions5, boolean z, int i, int i2, Composer composer, int i3) {
        ChartWithOverlays(modifier, list, list2, interactions5, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartWithOverlays$lambda$2(Modifier modifier, List list, List list2, long j, Function1 function1, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        ChartWithOverlays(modifier, list, list2, j, function1, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ChartWithOverlays(final Modifier modifier, final List<? extends ChartAnnotation> list, List<Overlays> list2, Interactions5 interactions5, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        List<? extends ChartAnnotation> list3;
        List<Overlays> list4;
        int i4;
        Interactions5 interactions52;
        int i5;
        boolean z2;
        final List<Overlays> listEmptyList;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Interactions5 interactions53;
        final Interactions5 interactions54;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071534153);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            list3 = list;
        } else {
            list3 = list;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(list3) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                list4 = list2;
                i3 |= composerStartRestartGroup.changedInstance(list4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    interactions52 = interactions5;
                    i3 |= composerStartRestartGroup.changed(interactions52) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        listEmptyList = i6 == 0 ? CollectionsKt.emptyList() : list4;
                        if (i4 != 0) {
                            interactions52 = null;
                        }
                        z3 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1071534153, i3, -1, "com.robinhood.android.charts.ChartWithOverlays (ChartWithOverlays.kt:22)");
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (!z3) {
                            composerStartRestartGroup.startReplaceGroup(-1388435226);
                            Placeholders2.ChartPlaceholder(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, composerStartRestartGroup, 54, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            interactions53 = interactions52;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1388289960);
                            interactions53 = interactions52;
                            Chart2.Chart(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), list3, interactions53, composerStartRestartGroup, (i3 & 112) | 6 | ((i3 >> 3) & 896), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        Overlays2.Overlays(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), listEmptyList, composerStartRestartGroup, ((i3 >> 3) & 112) | 6, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        interactions54 = interactions53;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        listEmptyList = list4;
                        interactions54 = interactions52;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.ChartWithOverlaysKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChartWithOverlays.ChartWithOverlays$lambda$1(modifier, list, listEmptyList, interactions54, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (!z3) {
                        }
                        Overlays2.Overlays(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), listEmptyList, composerStartRestartGroup, ((i3 >> 3) & 112) | 6, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        interactions54 = interactions53;
                        z4 = z3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            interactions52 = interactions5;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        list4 = list2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        interactions52 = interactions5;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartWithOverlays(final Modifier modifier, final List<? extends ChartAnnotation> annotations, List<Overlays> list, long j, Function1<? super Point, Unit> function1, Function0<Unit> function0, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        List<Overlays> listEmptyList;
        int i4;
        final long j2;
        int i5;
        final Function1<? super Point, Unit> function12;
        int i6;
        final Function0<Unit> function02;
        int i7;
        boolean z2;
        final List<Overlays> list2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Composer composerStartRestartGroup = composer.startRestartGroup(-837601387);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(annotations) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                listEmptyList = list;
                i3 |= composerStartRestartGroup.changedInstance(listEmptyList) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                }
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        if (i4 != 0) {
                            j2 = 200;
                        }
                        if (i5 != 0) {
                            function12 = null;
                        }
                        if (i6 != 0) {
                            function02 = null;
                        }
                        boolean z4 = i7 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-837601387, i3, -1, "com.robinhood.android.charts.ChartWithOverlays (ChartWithOverlays.kt:52)");
                        }
                        List<Overlays> list3 = listEmptyList;
                        ChartWithOverlays(modifier, annotations, list3, (function12 == null || function02 != null) ? new Interactions5(j2, function12, function02) { // from class: com.robinhood.android.charts.ChartWithOverlaysKt$ChartWithOverlays$scrubListener$1
                            final /* synthetic */ Function1<Point, Unit> $onScrub;
                            final /* synthetic */ Function0<Unit> $onScrubStopped;
                            private final long longPressTimeoutMillis;

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.$onScrub = function12;
                                this.$onScrubStopped = function02;
                                this.longPressTimeoutMillis = j2;
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public long getLongPressTimeoutMillis() {
                                return this.longPressTimeoutMillis;
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public void onScrub(Point point) {
                                Intrinsics.checkNotNullParameter(point, "point");
                                Function1<Point, Unit> function13 = this.$onScrub;
                                if (function13 != null) {
                                    function13.invoke(point);
                                }
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public void onScrubStopped() {
                                Function0<Unit> function03 = this.$onScrubStopped;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                            }
                        } : null, z4, composerStartRestartGroup, (i3 & 1022) | (57344 & (i3 >> 6)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        list2 = list3;
                        z3 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z3 = z2;
                        list2 = listEmptyList;
                    }
                    final long j3 = j2;
                    final Function1<? super Point, Unit> function13 = function12;
                    final Function0<Unit> function03 = function02;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.ChartWithOverlaysKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChartWithOverlays.ChartWithOverlays$lambda$2(modifier, annotations, list2, j3, function13, function03, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function02 = function0;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (function12 == null) {
                        List<Overlays> list32 = listEmptyList;
                        ChartWithOverlays(modifier, annotations, list32, (function12 == null || function02 != null) ? new Interactions5(j2, function12, function02) { // from class: com.robinhood.android.charts.ChartWithOverlaysKt$ChartWithOverlays$scrubListener$1
                            final /* synthetic */ Function1<Point, Unit> $onScrub;
                            final /* synthetic */ Function0<Unit> $onScrubStopped;
                            private final long longPressTimeoutMillis;

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.$onScrub = function12;
                                this.$onScrubStopped = function02;
                                this.longPressTimeoutMillis = j2;
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public long getLongPressTimeoutMillis() {
                                return this.longPressTimeoutMillis;
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public void onScrub(Point point) {
                                Intrinsics.checkNotNullParameter(point, "point");
                                Function1<Point, Unit> function132 = this.$onScrub;
                                if (function132 != null) {
                                    function132.invoke(point);
                                }
                            }

                            @Override // com.robinhood.android.charts.Interactions5
                            public void onScrubStopped() {
                                Function0<Unit> function032 = this.$onScrubStopped;
                                if (function032 != null) {
                                    function032.invoke();
                                }
                            }
                        } : null, z4, composerStartRestartGroup, (i3 & 1022) | (57344 & (i3 >> 6)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        list2 = list32;
                        z3 = z4;
                    }
                }
                final long j32 = j2;
                final Function1 function132 = function12;
                final Function0 function032 = function02;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function02 = function0;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            final long j322 = j2;
            final Function1 function1322 = function12;
            final Function0 function0322 = function02;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        listEmptyList = list;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function12 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function02 = function0;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        final long j3222 = j2;
        final Function1 function13222 = function12;
        final Function0 function03222 = function02;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
