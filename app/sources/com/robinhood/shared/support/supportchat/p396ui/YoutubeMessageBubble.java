package com.robinhood.shared.support.supportchat.p396ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.SingletonAsyncImage;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: YoutubeMessageBubble.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"YouTubeMessageBubble", "", "message", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$MediaYouTube;", "inquiryId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$MediaYouTube;Ljava/util/UUID;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.YoutubeMessageBubbleKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class YoutubeMessageBubble {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YouTubeMessageBubble$lambda$4(UiChatMessage.Regular.MediaYouTube mediaYouTube, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        YouTubeMessageBubble(mediaYouTube, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YouTubeMessageBubble(final UiChatMessage.Regular.MediaYouTube message, final UUID inquiryId, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final UriHandler uriHandler;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-358654625);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(inquiryId) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-358654625, i3, -1, "com.robinhood.shared.support.supportchat.ui.YouTubeMessageBubble (YoutubeMessageBubble.kt:32)");
                }
                uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                UserInteractionEventData.Action action = UserInteractionEventData.Action.OPEN_URL;
                Component component = new Component(Component.ComponentType.ROW, "YOUTUBE_VIDEO", null, 4, null);
                String string2 = inquiryId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = message.getTarget().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, string3, 0, null, null, null, null, ChatMessageComposable.getEventType(message.getSenderType()), message.getUsableSid(), "Robinhood Answers Youtube Video", 0, null, false, null, false, null, 8273662, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(message);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.YoutubeMessageBubbleKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return YoutubeMessageBubble.YouTubeMessageBubble$lambda$1$lambda$0(uriHandler, message);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), userInteractionEventDescriptor, false, false, false, true, false, null, 108, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
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
                String thumbnailUrl = message.getThumbnailUrl();
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SingletonAsyncImage.m9119AsyncImagegl8XCv8(thumbnailUrl, "YouTube thumbnail", AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.7777778f, false, 2, null), null, null, null, crop, 0.0f, null, 0, false, null, composerStartRestartGroup, 1573296, 0, 4024);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(boxScopeInstance.align(companion3, companion.getCenter()), C2002Dp.m7995constructorimpl(56));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
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
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.PLAY_HERO_40), "Play video", Color.INSTANCE.m6727getWhite0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size40.$stable | 432, 56);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.YoutubeMessageBubbleKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return YoutubeMessageBubble.YouTubeMessageBubble$lambda$4(message, inquiryId, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.OPEN_URL;
            Component component2 = new Component(Component.ComponentType.ROW, "YOUTUBE_VIDEO", null, 4, null);
            String string22 = inquiryId.toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            String string32 = message.getTarget().toString();
            Intrinsics.checkNotNullExpressionValue(string32, "toString(...)");
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, null, action2, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string22, null, null, null, null, null, null, null, string32, 0, null, null, null, null, ChatMessageComposable.getEventType(message.getSenderType()), message.getUsableSid(), "Robinhood Answers Youtube Video", 0, null, false, null, false, null, 8273662, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component2, null, 35, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changedInstance(message);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.YoutubeMessageBubbleKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return YoutubeMessageBubble.YouTubeMessageBubble$lambda$1$lambda$0(uriHandler, message);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null), userInteractionEventDescriptor2, false, false, false, true, false, null, 108, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    String thumbnailUrl2 = message.getThumbnailUrl();
                    ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    SingletonAsyncImage.m9119AsyncImagegl8XCv8(thumbnailUrl2, "YouTube thumbnail", AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 1.7777778f, false, 2, null), null, null, null, crop2, 0.0f, null, 0, false, null, composerStartRestartGroup, 1573296, 0, 4024);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(boxScopeInstance2.align(companion32, companion4.getCenter()), C2002Dp.m7995constructorimpl(56));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
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
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.PLAY_HERO_40), "Play video", Color.INSTANCE.m6727getWhite0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size40.$stable | 432, 56);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YouTubeMessageBubble$lambda$1$lambda$0(UriHandler uriHandler, UiChatMessage.Regular.MediaYouTube mediaYouTube) {
        String string2 = mediaYouTube.getTarget().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }
}
