package com.truelayer.payments.p419ui.screens.wait.components;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.truelayer.payments.p419ui.components.EncircledProviderImage4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgressIndicatorWithImage.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m3636d2 = {"ProgressIndicatorWithImage", "", "imageUri", "", "extendedImageUri", "imageSize", "Landroidx/compose/ui/unit/Dp;", "ringSize", "strokeWidth", "enabled", "", "ProgressIndicatorWithImage-Cxxc4bg", "(Ljava/lang/String;Ljava/lang/String;FFFZLandroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.wait.components.ProgressIndicatorWithImageKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProgressIndicatorWithImage {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /* renamed from: ProgressIndicatorWithImage-Cxxc4bg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27157ProgressIndicatorWithImageCxxc4bg(final String str, final String str2, float f, float f2, float f3, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        float f4;
        int i5;
        float f5;
        int i6;
        float fM7995constructorimpl;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f6;
        float f7;
        final float f8;
        Composer composer2;
        final float f9;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(136119709);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f4 = f;
                    i3 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        f5 = f2;
                        i3 |= composerStartRestartGroup.changed(f5) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((57344 & i) == 0) {
                            fM7995constructorimpl = f3;
                            i3 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 == 0) {
                            if ((458752 & i) == 0) {
                                z2 = z;
                                i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i8 = i3;
                            if ((374491 & i8) != 74898 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                f8 = f4;
                                composer2 = composerStartRestartGroup;
                                f9 = fM7995constructorimpl;
                                z4 = z2;
                            } else {
                                float fM7995constructorimpl2 = i4 == 0 ? C2002Dp.m7995constructorimpl(56) : f4;
                                float fM7995constructorimpl3 = i5 == 0 ? C2002Dp.m7995constructorimpl(108) : f5;
                                if (i6 != 0) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                                }
                                z3 = i7 == 0 ? true : z2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(136119709, i8, -1, "com.truelayer.payments.ui.screens.wait.components.ProgressIndicatorWithImage (ProgressIndicatorWithImage.kt:23)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, fM7995constructorimpl3);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment center = companion2.getCenter();
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5169size3ABfNKs);
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(266223826);
                                if (str == null) {
                                    f6 = fM7995constructorimpl2;
                                    EncircledProviderImage4.m27039EncircledProviderImageRfXq3Jk(boxScopeInstance.align(companion, companion2.getCenter()), f6, str3, str, null, null, composerStartRestartGroup, ((i8 >> 3) & 112) | ((i8 << 3) & 896) | ((i8 << 9) & 7168), 48);
                                } else {
                                    f6 = fM7995constructorimpl2;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(138850499);
                                if (z3) {
                                    f7 = fM7995constructorimpl;
                                    f5 = fM7995constructorimpl3;
                                } else {
                                    f7 = fM7995constructorimpl;
                                    f5 = fM7995constructorimpl3;
                                    ProgressIndicatorKt.m5922CircularProgressIndicatorLxG7B9w(SizeKt.m5169size3ABfNKs(companion, fM7995constructorimpl3), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondary(), f7, DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0) ? Color.INSTANCE.m6719getDarkGray0d7_KjU() : Color.INSTANCE.m6722getLightGray0d7_KjU(), 0, composerStartRestartGroup, (i8 >> 6) & 896, 16);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f8 = f6;
                                composer2 = composerStartRestartGroup;
                                f9 = f7;
                                z4 = z3;
                            }
                            final float f10 = f5;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.components.ProgressIndicatorWithImageKt$ProgressIndicatorWithImage$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        ProgressIndicatorWithImage.m27157ProgressIndicatorWithImageCxxc4bg(str, str2, f8, f10, f9, z4, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        z2 = z;
                        i8 = i3;
                        if ((374491 & i8) != 74898) {
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(companion4, fM7995constructorimpl3);
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            Alignment center2 = companion22.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM5169size3ABfNKs2);
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(266223826);
                                if (str == null) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(138850499);
                                if (z3) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f8 = f6;
                                composer2 = composerStartRestartGroup;
                                f9 = f7;
                                z4 = z3;
                            }
                        }
                        final float f102 = f5;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fM7995constructorimpl = f3;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    z2 = z;
                    i8 = i3;
                    if ((374491 & i8) != 74898) {
                    }
                    final float f1022 = f5;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                f5 = f2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM7995constructorimpl = f3;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                z2 = z;
                i8 = i3;
                if ((374491 & i8) != 74898) {
                }
                final float f10222 = f5;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f4 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f5 = f2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM7995constructorimpl = f3;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            z2 = z;
            i8 = i3;
            if ((374491 & i8) != 74898) {
            }
            final float f102222 = f5;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f5 = f2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM7995constructorimpl = f3;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        z2 = z;
        i8 = i3;
        if ((374491 & i8) != 74898) {
        }
        final float f1022222 = f5;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
