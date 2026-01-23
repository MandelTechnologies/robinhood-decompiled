package com.robinhood.compose.infoscreen;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRenderer;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.infoscreen.InfoScreenFooter;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InfoScreen.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001as\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"CloseButtonTag", "", "InfoScreenHeader", "", "image", "Lcom/robinhood/models/serverdriven/experimental/api/AspectFillRemoteImage;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "closeIconColor", "onCloseClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "InfoScreenHeader-DTcfvLk", "(Lcom/robinhood/models/serverdriven/experimental/api/AspectFillRemoteImage;JJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoScreen", "title", "headerImage", "content", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "callbacks", "Lcom/robinhood/compose/infoscreen/InfoScreenCallbacks;", "headerBackgroundColor", "statusBarUseDarkIcons", "", Footer.f10637type, "Lcom/robinhood/compose/infoscreen/InfoScreenFooter;", "InfoScreen-dNgdfXs", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AspectFillRemoteImage;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/compose/infoscreen/InfoScreenCallbacks;Landroidx/compose/ui/Modifier;JJZLcom/robinhood/compose/infoscreen/InfoScreenFooter;Landroidx/compose/runtime/Composer;II)V", "lib-compose-info-screen_externalDebug", "showFooterDivider"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class InfoScreenKt {
    public static final String CloseButtonTag = "close_button";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoScreenHeader_DTcfvLk$lambda$1(AspectFillRemoteImage aspectFillRemoteImage, long j, long j2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m21678InfoScreenHeaderDTcfvLk(aspectFillRemoteImage, j, j2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoScreen_dNgdfXs$lambda$6(String str, AspectFillRemoteImage aspectFillRemoteImage, ImmutableList immutableList, InfoScreenCallbacks infoScreenCallbacks, Modifier modifier, long j, long j2, boolean z, InfoScreenFooter infoScreenFooter, int i, int i2, Composer composer, int i3) {
        m21677InfoScreendNgdfXs(str, aspectFillRemoteImage, immutableList, infoScreenCallbacks, modifier, j, j2, z, infoScreenFooter, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: InfoScreenHeader-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21678InfoScreenHeaderDTcfvLk(final AspectFillRemoteImage<? extends GenericAction> aspectFillRemoteImage, final long j, final long j2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        AspectFillRemoteImage<? extends GenericAction> aspectFillRemoteImage2;
        int i3;
        long j3;
        int i4;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1007365685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            aspectFillRemoteImage2 = aspectFillRemoteImage;
        } else if ((i & 6) == 0) {
            aspectFillRemoteImage2 = aspectFillRemoteImage;
            i3 = (composerStartRestartGroup.changedInstance(aspectFillRemoteImage2) ? 4 : 2) | i;
        } else {
            aspectFillRemoteImage2 = aspectFillRemoteImage;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1007365685, i3, -1, "com.robinhood.compose.infoscreen.InfoScreenHeader (InfoScreen.kt:62)");
                    }
                    Modifier modifier4 = modifier3;
                    Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(Background3.m4872backgroundbw27NRU$default(modifier3, j3, null, 2, null), WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    int i5 = i3;
                    RemoteImageRenderer.SduiAspectFillRemoteImage(aspectFillRemoteImage2, SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(aspectFillRemoteImage2.getImage_size().getHeight())), false, null, composerStartRestartGroup, i5 & 14, 12);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), j2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance.align(TestTag3.testTag(companion3, "close_button"), companion.getTopStart()), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0), function0, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | (i5 & 896) | ((i5 << 3) & 57344), 32);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InfoScreenKt.InfoScreenHeader_DTcfvLk$lambda$1(aspectFillRemoteImage, j, j2, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = modifier3;
                Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(Background3.m4872backgroundbw27NRU$default(modifier3, j3, null, 2, null), WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6));
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    int i52 = i3;
                    RemoteImageRenderer.SduiAspectFillRemoteImage(aspectFillRemoteImage2, SizeKt.m5156height3ABfNKs(companion32, C2002Dp.m7995constructorimpl(aspectFillRemoteImage2.getImage_size().getHeight())), false, null, composerStartRestartGroup, i52 & 14, 12);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), j2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(boxScopeInstance2.align(TestTag3.testTag(companion32, "close_button"), companion4.getTopStart()), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0), function0, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | (i52 & 896) | ((i52 << 3) & 57344), 32);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InfoScreen_dNgdfXs$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104 A[PHI: r19
      0x0104: PHI (r19v16 int) = (r19v0 int), (r19v6 int), (r19v7 int) binds: [B:88:0x0102, B:98:0x011f, B:97:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* renamed from: InfoScreen-dNgdfXs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21677InfoScreendNgdfXs(final String title, final AspectFillRemoteImage<? extends GenericAction> headerImage, final ImmutableList<? extends UIComponent<? extends GenericAction>> content, InfoScreenCallbacks infoScreenCallbacks, Modifier modifier, long j, long j2, boolean z, InfoScreenFooter infoScreenFooter, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long nova;
        int i4;
        boolean z2;
        int i5;
        long jade;
        int i6;
        Modifier modifier3;
        long j3;
        boolean z3;
        long j4;
        final InfoScreenFooter infoScreenFooter2;
        Object objRememberedValue;
        Composer.Companion companion;
        SystemUiController systemUiControllerRememberSystemUiController;
        boolean zChanged;
        Object objRememberedValue2;
        final long j5;
        final long j6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final InfoScreenCallbacks callbacks = infoScreenCallbacks;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-293177154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(headerImage) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                nova = j2;
                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(nova)) ? 1048576 : 524288;
            } else {
                nova = j2;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                }
            }
            i5 = i2 & 256;
            int i8 = 100663296;
            if (i5 != 0) {
                i3 |= i8;
            } else if ((i & 100663296) == 0) {
                i8 = (i & 134217728) == 0 ? composerStartRestartGroup.changed(infoScreenFooter) : composerStartRestartGroup.changedInstance(infoScreenFooter) ? 67108864 : 33554432;
                i3 |= i8;
            }
            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 32) == 0) {
                        jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade();
                        i3 &= -458753;
                    } else {
                        jade = j;
                    }
                    if ((i2 & 64) != 0) {
                        nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                        i3 &= -3670017;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (i5 == 0) {
                        modifier3 = modifier2;
                        j3 = nova;
                        z3 = z2;
                        infoScreenFooter2 = InfoScreenFooter.Close.INSTANCE;
                        i6 = i3;
                        j4 = jade;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-293177154, i6, -1, "com.robinhood.compose.infoscreen.InfoScreen (InfoScreen.kt:106)");
                        }
                        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        int i9 = i6;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(InfoScreenKt.InfoScreen_dNgdfXs$lambda$3$lambda$2(lazyListStateRememberLazyListState));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        InfoScreenKt$InfoScreen$1 infoScreenKt$InfoScreen$1 = new InfoScreenKt$InfoScreen$1(modifier3, lazyListStateRememberLazyListState, callbacks, headerImage, j4, j3, title, content, infoScreenFooter2, (SnapshotState4) objRememberedValue);
                        callbacks = callbacks;
                        SduiActionHandler3.ProvideActionHandler(callbacks, ComposableLambda3.rememberComposableLambda(-825372035, true, infoScreenKt$InfoScreen$1, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 9) & 14) | 48);
                        systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((((i9 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(j4)) || (i9 & 196608) == 131072) | ((i9 & 29360128) == 8388608);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            boolean z4 = z3;
                            objRememberedValue2 = new InfoScreenKt$InfoScreen$2$1(systemUiControllerRememberSystemUiController, j4, z4, null);
                            z2 = z4;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            z2 = z3;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j5 = j3;
                        j6 = j4;
                        modifier4 = modifier3;
                    } else {
                        i6 = i3;
                        modifier3 = modifier2;
                        j3 = nova;
                        z3 = z2;
                        j4 = jade;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    j3 = nova;
                    z3 = z2;
                    j4 = j;
                }
                infoScreenFooter2 = infoScreenFooter;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i92 = i6;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoScreenKt$InfoScreen$1 infoScreenKt$InfoScreen$12 = new InfoScreenKt$InfoScreen$1(modifier3, lazyListStateRememberLazyListState2, callbacks, headerImage, j4, j3, title, content, infoScreenFooter2, (SnapshotState4) objRememberedValue);
                callbacks = callbacks;
                SduiActionHandler3.ProvideActionHandler(callbacks, ComposableLambda3.rememberComposableLambda(-825372035, true, infoScreenKt$InfoScreen$12, composerStartRestartGroup, 54), composerStartRestartGroup, ((i92 >> 9) & 14) | 48);
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                if (((i92 & 458752) ^ 196608) <= 131072) {
                    zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((((i92 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(j4)) || (i92 & 196608) == 131072) | ((i92 & 29360128) == 8388608);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        boolean z42 = z3;
                        objRememberedValue2 = new InfoScreenKt$InfoScreen$2$1(systemUiControllerRememberSystemUiController, j4, z42, null);
                        z2 = z42;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j5 = j3;
                        j6 = j4;
                        modifier4 = modifier3;
                    }
                } else {
                    zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((((i92 & 458752) ^ 196608) <= 131072 && composerStartRestartGroup.changed(j4)) || (i92 & 196608) == 131072) | ((i92 & 29360128) == 8388608);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j5 = nova;
                j6 = j;
                infoScreenFooter2 = infoScreenFooter;
            }
            final boolean z5 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoScreenKt.InfoScreen_dNgdfXs$lambda$6(title, headerImage, content, callbacks, modifier4, j6, j5, z5, infoScreenFooter2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i & 196608) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i5 = i2 & 256;
        int i82 = 100663296;
        if (i5 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
            }
        }
        final boolean z52 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InfoScreen_dNgdfXs$lambda$3$lambda$2(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }
}
