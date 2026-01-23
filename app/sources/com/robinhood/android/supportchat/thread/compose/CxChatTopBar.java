package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar4;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.supportchat.C40042R;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatTopBar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00012\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"CxChatTopBar", "", "title", "", "avatarIcon", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "avatarSliverColorHex", "modifier", "Landroidx/compose/ui/Modifier;", "avatarA11yDescription", "avatarStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "endButtonStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "onClickEndCta", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Avatar", "(Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusIndicator", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Landroidx/compose/runtime/Composer;I)V", "EndButton", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview", "args", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBarPreviewProvider$Args;", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBarPreviewProvider$Args;Landroidx/compose/runtime/Composer;I)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatTopBar {

    /* compiled from: CxChatTopBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CxChatTopBar5.AvatarStatus.values().length];
            try {
                iArr[CxChatTopBar5.AvatarStatus.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CxChatTopBar5.AvatarStatus.Online.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CxChatTopBar5.AvatarStatus.Offline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CxChatTopBar5.EndButtonStatus.values().length];
            try {
                iArr2[CxChatTopBar5.EndButtonStatus.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CxChatTopBar5.EndButtonStatus.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CxChatTopBar5.EndButtonStatus.Enabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CxChatTopBar5.EndButtonStatus.Disabled.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Avatar$lambda$5(ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str, CxChatTopBar5.AvatarStatus avatarStatus, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Avatar(serverToBentoAssetMapper3, str, avatarStatus, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatTopBar$lambda$1(String str, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str2, Modifier modifier, String str3, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus, Function0 function0, int i, int i2, Composer composer, int i3) {
        CxChatTopBar(str, serverToBentoAssetMapper3, str2, modifier, str3, avatarStatus, endButtonStatus, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EndButton$lambda$10(CxChatTopBar5.EndButtonStatus endButtonStatus, Function0 function0, int i, Composer composer, int i2) {
        EndButton(endButtonStatus, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EndButton$lambda$9(CxChatTopBar5.EndButtonStatus endButtonStatus, Function0 function0, int i, Composer composer, int i2) {
        EndButton(endButtonStatus, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$12(CxChatTopBar4.Args args, int i, Composer composer, int i2) {
        Preview(args, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusIndicator$lambda$6(BoxScope boxScope, CxChatTopBar5.AvatarStatus avatarStatus, int i, Composer composer, int i2) {
        StatusIndicator(boxScope, avatarStatus, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatusIndicator$lambda$8(BoxScope boxScope, CxChatTopBar5.AvatarStatus avatarStatus, int i, Composer composer, int i2) {
        StatusIndicator(boxScope, avatarStatus, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[PHI: r14
      0x00ae: PHI (r14v14 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:56:0x00ac, B:66:0x00c4, B:65:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CxChatTopBar(final String title, final ServerToBentoAssetMapper3 avatarIcon, final String avatarSliverColorHex, Modifier modifier, String str, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus, Function0<Unit> onClickEndCta, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function0<Unit> function0;
        final CxChatTopBar5.EndButtonStatus endButtonStatus2;
        Composer composer2;
        final Modifier modifier3;
        final String str3;
        final CxChatTopBar5.AvatarStatus avatarStatus2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(avatarSliverColorHex, "avatarSliverColorHex");
        Intrinsics.checkNotNullParameter(onClickEndCta, "onClickEndCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-342830881);
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
            i3 |= composerStartRestartGroup.changed(avatarIcon.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(avatarSliverColorHex) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i9 = 196608;
                if (i5 != 0) {
                    i3 |= i9;
                } else if ((196608 & i) == 0) {
                    i9 = composerStartRestartGroup.changed(avatarStatus == null ? -1 : avatarStatus.ordinal()) ? 131072 : 65536;
                    i3 |= i9;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(endButtonStatus == null ? -1 : endButtonStatus.ordinal()) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClickEndCta) ? 8388608 : 4194304;
                }
                i7 = i3;
                if ((4793491 & i7) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    String str4 = i4 == 0 ? "" : str2;
                    CxChatTopBar5.AvatarStatus avatarStatus3 = i5 == 0 ? CxChatTopBar5.AvatarStatus.Hidden : avatarStatus;
                    CxChatTopBar5.EndButtonStatus endButtonStatus3 = i6 == 0 ? CxChatTopBar5.EndButtonStatus.Hidden : endButtonStatus;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-342830881, i7, -1, "com.robinhood.android.supportchat.thread.compose.CxChatTopBar (CxChatTopBar.kt:54)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(modifier4, "TopBar");
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifierTestTag, bentoTheme.getColors(composerStartRestartGroup, i10).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i11 = i7 >> 3;
                    CxChatTopBar5.AvatarStatus avatarStatus4 = avatarStatus3;
                    Avatar(avatarIcon, avatarSliverColorHex, avatarStatus4, str4, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_end_spacing, composerStartRestartGroup, 0), 0.0f, 11, null), composerStartRestartGroup, (i11 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i7 >> 9) & 896) | (i11 & 7168), 0);
                    String str5 = str4;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, TestTag3.testTag(companion2, "Title"), 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i10).getTextM(), composerStartRestartGroup, i7 & 14, 0, 8184);
                    function0 = onClickEndCta;
                    endButtonStatus2 = endButtonStatus3;
                    EndButton(endButtonStatus2, function0, composerStartRestartGroup, (i7 >> 18) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier5;
                    str3 = str5;
                    avatarStatus2 = avatarStatus4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function0 = onClickEndCta;
                    str3 = str2;
                    avatarStatus2 = avatarStatus;
                    endButtonStatus2 = endButtonStatus;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CxChatTopBar.CxChatTopBar$lambda$1(title, avatarIcon, avatarSliverColorHex, modifier3, str3, avatarStatus2, endButtonStatus2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            str2 = str;
            i5 = i2 & 32;
            int i92 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i7 = i3;
            if ((4793491 & i7) != 4793490) {
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierTestTag2 = TestTag3.testTag(modifier4, "TopBar");
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i102 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(modifierTestTag2, bentoTheme2.getColors(composerStartRestartGroup, i102).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    int i112 = i7 >> 3;
                    CxChatTopBar5.AvatarStatus avatarStatus42 = avatarStatus3;
                    Avatar(avatarIcon, avatarSliverColorHex, avatarStatus42, str4, PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_end_spacing, composerStartRestartGroup, 0), 0.0f, 11, null), composerStartRestartGroup, (i112 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i7 >> 9) & 896) | (i112 & 7168), 0);
                    String str52 = str4;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row62, TestTag3.testTag(companion22, "Title"), 1.0f, false, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i102).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i102).getTextM(), composerStartRestartGroup, i7 & 14, 0, 8184);
                    function0 = onClickEndCta;
                    endButtonStatus2 = endButtonStatus3;
                    EndButton(endButtonStatus2, function0, composerStartRestartGroup, (i7 >> 18) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier52;
                    str3 = str52;
                    avatarStatus2 = avatarStatus42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        str2 = str;
        i5 = i2 & 32;
        int i922 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i7 = i3;
        if ((4793491 & i7) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Avatar(final ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str, CxChatTopBar5.AvatarStatus avatarStatus, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        CxChatTopBar5.AvatarStatus avatarStatus2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1117388809);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(serverToBentoAssetMapper3.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(avatarStatus.ordinal()) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    avatarStatus2 = avatarStatus;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1117388809, i3, -1, "com.robinhood.android.supportchat.thread.compose.Avatar (CxChatTopBar.kt:93)");
                    }
                    Modifier contentDescription$default = ModifiersKt.setContentDescription$default(TestTag3.testTag(modifier3, "Avatar"), str2, false, 2, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, contentDescription$default);
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
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_icon_size, composerStartRestartGroup, 0)), RoundedCornerShape2.getCircleShape()), Color2.Color(android.graphics.Color.parseColor(str3)), null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_icon_size, composerStartRestartGroup, 0));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    BentoPogKt.m20684BentoPictogramPogRhg8lNc(serverToBentoAssetMapper3.getResourceId(), SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), false, null, null, null, null, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composerStartRestartGroup.endNode();
                    avatarStatus2 = avatarStatus;
                    StatusIndicator(boxScopeInstance, avatarStatus2, composerStartRestartGroup, ((i3 >> 3) & 112) | 6);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final String str4 = str3;
                    final CxChatTopBar5.AvatarStatus avatarStatus3 = avatarStatus2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CxChatTopBar.Avatar$lambda$5(serverToBentoAssetMapper3, str4, avatarStatus3, str2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier contentDescription$default2 = ModifiersKt.setContentDescription$default(TestTag3.testTag(modifier3, "Avatar"), str2, false, 2, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, contentDescription$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_icon_size, composerStartRestartGroup, 0)), RoundedCornerShape2.getCircleShape()), Color2.Color(android.graphics.Color.parseColor(str3)), null, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_avatar_icon_size, composerStartRestartGroup, 0));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy32, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            BentoPogKt.m20684BentoPictogramPogRhg8lNc(serverToBentoAssetMapper3.getResourceId(), SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), false, null, null, null, null, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composerStartRestartGroup.endNode();
                            avatarStatus2 = avatarStatus;
                            StatusIndicator(boxScopeInstance2, avatarStatus2, composerStartRestartGroup, ((i3 >> 3) & 112) | 6);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void StatusIndicator(final BoxScope boxScope, final CxChatTopBar5.AvatarStatus avatarStatus, Composer composer, final int i) {
        int i2;
        long prime;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1297270287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(avatarStatus.ordinal()) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297270287, i2, -1, "com.robinhood.android.supportchat.thread.compose.StatusIndicator (CxChatTopBar.kt:131)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[avatarStatus.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-863199957);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CxChatTopBar.StatusIndicator$lambda$6(boxScope, avatarStatus, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(-1136221578);
                prime = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-1136225751);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1136219340);
                prime = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = prime;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, "StatusIndicator");
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(boxScope.align(modifierTestTag, companion2.getBottomEnd()), RoundedCornerShape2.getCircleShape()), j, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_status_indicator_border_width, composerStartRestartGroup, 0)), PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_top_bar_status_indicator_size, composerStartRestartGroup, 0)), RoundedCornerShape2.getCircleShape()), avatarStatus.m19183indicatorColorWaAFU9c(composerStartRestartGroup, (i2 >> 3) & 14), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatTopBar.StatusIndicator$lambda$8(boxScope, avatarStatus, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EndButton(final CxChatTopBar5.EndButtonStatus endButtonStatus, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-523050276);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(endButtonStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-523050276, i2, -1, "com.robinhood.android.supportchat.thread.compose.EndButton (CxChatTopBar.kt:158)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$1[endButtonStatus.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-49224832);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CxChatTopBar.EndButton$lambda$9(endButtonStatus, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(-49158554);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "EndLoadingIndicator");
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(PaddingKt.m5142padding3ABfNKs(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), BentoProgressIndicator3.f5151S, bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3 && i3 != 4) {
                    composerStartRestartGroup.startReplaceGroup(-140135939);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-48680968);
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, "EndButton"), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.END_CX_CHAT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                int i5 = i2;
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C40042R.string.support_chat_thread_header_end_chat, composerStartRestartGroup, 0), modifierAutoLogEvents$default, null, BentoTextButton3.Size.f5148S, endButtonStatus == CxChatTopBar5.EndButtonStatus.Enabled, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU()), composerStartRestartGroup, ((i5 >> 3) & 14) | 24576, 8);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            function2 = new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatTopBar.EndButton$lambda$10(endButtonStatus, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    private static final void Preview(final CxChatTopBar4.Args args, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2065983667);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(args) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2065983667, i2, -1, "com.robinhood.android.supportchat.thread.compose.Preview (CxChatTopBar.kt:239)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1112315745, true, new CxChatTopBar2(args), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(8)), composerStartRestartGroup, 6);
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1665398616, true, new CxChatTopBar3(args), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatTopBar.Preview$lambda$12(args, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
