package com.robinhood.shared.support.supportchat.p396ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.ImageResult2;
import coil.size.Size;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.mediaservice.RedirectImageLoader;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.supportchat.C40042R;
import com.robinhood.shared.support.supportchat.p396ui.ImageContent5;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.util.ChatImageLoadHelper;
import com.robinhood.shared.support.supportchat.util.ChatImages;
import com.robinhood.store.supportchat.ChatImageUtils;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: ImageContent.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a[\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b!\u0010\"\u001a=\u0010(\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110 H\u0003¢\u0006\u0004\b*\u0010+\"\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00066²\u0006\u000e\u00102\u001a\u0002018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00105\u001a\u0004\u0018\u0001048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Image;", "message", "Landroidx/compose/ui/Modifier;", "modifier", "", "ImageContent", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Image;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Lkotlin/Function0;", "content", "ImageBound-pBklqvs", "(FFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ImageBound", "", "sid", "", "Landroid/graphics/Bitmap;", "bitmap", "Lokhttp3/HttpUrl;", MarkdownText4.TagImageUrl, "imageDescription", "onFailImageLoad", "Image", "(Ljava/lang/String;IILandroid/graphics/Bitmap;Lokhttp3/HttpUrl;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Error", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "originalWidth", "originalHeight", "maxLayoutWidth", "maxLayoutHeight", "Lkotlin/Pair;", "getExpectedFinalImageSize--vR-za8", "(FFFFLandroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "getExpectedFinalImageSize", "Lcoil/request/ErrorResult;", "errorResult", "fallbackOnBitmap", "showError", "handleChatImageLoadError", "(Lcoil/request/ErrorResult;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "selectThumbnailSize", "(Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "Lcom/robinhood/shared/support/supportchat/ui/ChatImageLoadHelperCompositionLocal;", "LocalChatImageLoadHelper", "Lcom/robinhood/shared/support/supportchat/ui/ChatImageLoadHelperCompositionLocal;", "getLocalChatImageLoadHelper", "()Lcom/robinhood/shared/support/supportchat/ui/ChatImageLoadHelperCompositionLocal;", "Lcom/robinhood/shared/support/supportchat/ui/Component;", "visibleComponent", "cachedBitmap", "", "imageSource", "lib-support-chat_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.ImageContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ImageContent5 {
    private static final ImageContent2 LocalChatImageLoadHelper = new ImageContent2(null, 1, 0 == true ? 1 : 0);

    /* compiled from: ImageContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ImageContentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageContent3.values().length];
            try {
                iArr[ImageContent3.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageContent3.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Error$lambda$19(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Error(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Image$lambda$17(String str, int i, int i2, Bitmap bitmap, HttpUrl httpUrl, String str2, Function0 function0, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        Image(str, i, i2, bitmap, httpUrl, str2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageBound_pBklqvs$lambda$12(float f, float f2, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m25767ImageBoundpBklqvs(f, f2, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageContent$lambda$11(UiChatMessage.Regular.Image image, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        ImageContent(image, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Image$lambda$14(SnapshotState<Object> snapshotState) {
        return snapshotState.getValue();
    }

    private static final ImageContent3 ImageContent$lambda$1(SnapshotState<ImageContent3> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Bitmap ImageContent$lambda$4(SnapshotState<Bitmap> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImageContent(final UiChatMessage.Regular.Image message, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ChatImageLoadHelper current;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        int i4;
        HttpUrl httpUrlGenerateImageUrl;
        Continuation continuation;
        SnapshotState snapshotState2;
        int i5;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object imageContent9;
        int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer composerStartRestartGroup = composer.startRestartGroup(1902331504);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1902331504, i3, -1, "com.robinhood.shared.support.supportchat.ui.ImageContent (ImageContent.kt:91)");
                }
                current = LocalChatImageLoadHelper.getCurrent(composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(ImageContent3.Image, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$0[ImageContent$lambda$1(snapshotState3).ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(264763265);
                    UUID documentId = message.getDocumentId();
                    composerStartRestartGroup.startReplaceGroup(-1515479074);
                    if (documentId == null) {
                        httpUrlGenerateImageUrl = null;
                    } else {
                        Tuples2<Integer, Integer> tuples2SelectThumbnailSize = selectThumbnailSize(composerStartRestartGroup, 0);
                        httpUrlGenerateImageUrl = ChatImages.generateImageUrl(current.getIdentiBaseUrl(), documentId, Integer.valueOf(tuples2SelectThumbnailSize.component1().intValue()), Integer.valueOf(tuples2SelectThumbnailSize.component2().intValue()));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    String strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_user_message_template, new Object[]{StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_message_send_image, composerStartRestartGroup, 0)}, composerStartRestartGroup, 0);
                    String localSid = message.getLocalSid();
                    if (localSid == null) {
                        localSid = message.getSid();
                    }
                    if (localSid == null) {
                        localSid = "";
                    }
                    int originalWidth = message.getOriginalWidth();
                    int originalHeight = message.getOriginalHeight();
                    Bitmap bitmapImageContent$lambda$4 = ImageContent$lambda$4(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    int i8 = i3;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ImageContent5.ImageContent$lambda$8$lambda$7(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    continuation = null;
                    HttpUrl httpUrl = httpUrlGenerateImageUrl;
                    snapshotState2 = snapshotState3;
                    i5 = 0;
                    Image(localSid, originalWidth, originalHeight, bitmapImageContent$lambda$4, httpUrl, strStringResource, (Function0) objRememberedValue4, modifier3, composerStartRestartGroup, ((i8 << 18) & 29360128) | 1572864, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    if (i4 != 2) {
                        composerStartRestartGroup.startReplaceGroup(-1515481430);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(265825697);
                    Error(modifier3, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState2 = snapshotState3;
                    continuation = null;
                    composer2 = composerStartRestartGroup;
                    i5 = 0;
                }
                UUID documentId2 = message.getDocumentId();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(message);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ImageContent8(message, snapshotState2, continuation);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(documentId2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i5);
                Uri encryptedImageUri = message.getEncryptedImageUri();
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance2 = composer2.changedInstance(message) | composer2.changedInstance(current);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    i6 = i5;
                    imageContent9 = new ImageContent9(message, current, snapshotState, snapshotState2, null);
                    composer2.updateRememberedValue(imageContent9);
                } else {
                    imageContent9 = objRememberedValue5;
                    i6 = i5;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(encryptedImageUri, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) imageContent9, composer2, i6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ImageContent5.ImageContent$lambda$11(message, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = LocalChatImageLoadHelper.getCurrent(composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            i4 = WhenMappings.$EnumSwitchMapping$0[ImageContent$lambda$1(snapshotState32).ordinal()];
            if (i4 != 1) {
            }
            UUID documentId22 = message.getDocumentId();
            composer2.startReplaceGroup(-1633490746);
            zChangedInstance = composer2.changedInstance(message);
            objRememberedValue3 = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new ImageContent8(message, snapshotState2, continuation);
                composer2.updateRememberedValue(objRememberedValue3);
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(documentId22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i5);
                Uri encryptedImageUri2 = message.getEncryptedImageUri();
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance2 = composer2.changedInstance(message) | composer2.changedInstance(current);
                Object objRememberedValue52 = composer2.rememberedValue();
                if (zChangedInstance2) {
                    i6 = i5;
                    imageContent9 = new ImageContent9(message, current, snapshotState, snapshotState2, null);
                    composer2.updateRememberedValue(imageContent9);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(encryptedImageUri2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) imageContent9, composer2, i6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Image$lambda$15(SnapshotState<Object> snapshotState, Object obj) {
        snapshotState.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageContent$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(ImageContent3.Error);
        return Unit.INSTANCE;
    }

    /* renamed from: ImageBound-pBklqvs, reason: not valid java name */
    private static final void m25767ImageBoundpBklqvs(final float f, final float f2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(635368313);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(635368313, i3, -1, "com.robinhood.shared.support.supportchat.ui.ImageBound (ImageContent.kt:165)");
            }
            BoxWithConstraints.BoxWithConstraints(SizeKt.m5157heightInVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0), PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_image_max_height, composerStartRestartGroup, 0)), null, false, ComposableLambda3.rememberComposableLambda(750120271, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$ImageBound$1
                public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(750120271, i5, -1, "com.robinhood.shared.support.supportchat.ui.ImageBound.<anonymous> (ImageContent.kt:172)");
                    }
                    Tuples2 tuples2M25769getExpectedFinalImageSizevRza8 = ImageContent5.m25769getExpectedFinalImageSizevRza8(f, f2, BoxWithConstraints.mo5103getMaxWidthD9Ej5fM(), BoxWithConstraints.mo5102getMaxHeightD9Ej5fM(), composer2, 0);
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5171sizeVpY3zN4(TestTag3.testTag(modifier3, "ImageBoundingBox"), ((C2002Dp) tuples2M25769getExpectedFinalImageSizevRza8.component1()).getValue(), ((C2002Dp) tuples2M25769getExpectedFinalImageSizevRza8.component2()).getValue()), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function22.invoke(composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer2, Integer num) {
                    invoke(boxWithConstraints4, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageContent5.ImageBound_pBklqvs$lambda$12(f, f2, modifier2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Image(final String str, final int i, final int i2, final Bitmap bitmap, final HttpUrl httpUrl, final String str2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i3, final int i4) {
        String str3;
        int i5;
        String str4;
        int i6;
        Modifier modifier2;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(353527306);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            str3 = str;
        } else if ((i3 & 6) == 0) {
            str3 = str;
            i5 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i3;
        } else {
            str3 = str;
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(bitmap) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(httpUrl) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else {
            if ((i3 & 196608) == 0) {
                str4 = str2;
                i5 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else {
                if ((i3 & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                }
                i6 = i4 & 128;
                if (i6 == 0) {
                    if ((12582912 & i3) == 0) {
                        modifier2 = modifier;
                        i5 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                    }
                    i7 = i5;
                    if ((4793491 & i7) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(353527306, i7, -1, "com.robinhood.shared.support.supportchat.ui.Image (ImageContent.kt:199)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        m25767ImageBoundpBklqvs(C2002Dp.m7995constructorimpl(i), C2002Dp.m7995constructorimpl(i2), null, ComposableLambda3.rememberComposableLambda(960659709, true, new C400611(modifier5, str3, bitmap, function0, str4, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(-1746271574);
                        zChangedInstance = composer2.changedInstance(httpUrl) | composer2.changedInstance(bitmap);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new ImageContent6(httpUrl, bitmap, snapshotState, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(httpUrl, bitmap, (Function2) objRememberedValue2, composer2, ((i7 >> 12) & 14) | ((i7 >> 6) & 112));
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ImageContent5.Image$lambda$17(str, i, i2, bitmap, httpUrl, str2, function0, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 12582912;
                modifier2 = modifier;
                i7 = i5;
                if ((4793491 & i7) == 4793490) {
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    m25767ImageBoundpBklqvs(C2002Dp.m7995constructorimpl(i), C2002Dp.m7995constructorimpl(i2), null, ComposableLambda3.rememberComposableLambda(960659709, true, new C400611(modifier52, str3, bitmap, function0, str4, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1746271574);
                    zChangedInstance = composer2.changedInstance(httpUrl) | composer2.changedInstance(bitmap);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new ImageContent6(httpUrl, bitmap, snapshotState, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(httpUrl, bitmap, (Function2) objRememberedValue2, composer2, ((i7 >> 12) & 14) | ((i7 >> 6) & 112));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            modifier2 = modifier;
            i7 = i5;
            if ((4793491 & i7) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        if ((i4 & 64) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i5;
        if ((4793491 & i7) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ImageContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ImageContentKt$Image$1 */
    static final class C400611 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $imageDescription;
        final /* synthetic */ SnapshotState<Object> $imageSource$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onFailImageLoad;
        final /* synthetic */ String $sid;

        C400611(Modifier modifier, String str, Bitmap bitmap, Function0<Unit> function0, String str2, SnapshotState<Object> snapshotState) {
            this.$modifier = modifier;
            this.$sid = str;
            this.$bitmap = bitmap;
            this.$onFailImageLoad = function0;
            this.$imageDescription = str2;
            this.$imageSource$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960659709, i, -1, "com.robinhood.shared.support.supportchat.ui.Image.<anonymous> (ImageContent.kt:203)");
            }
            if (ImageContent5.Image$lambda$14(this.$imageSource$delegate) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(this.$modifier, "MessageImage"), 0.0f, 1, null);
            RedirectImageLoader redirectImageLoader = ImageContent5.getLocalChatImageLoadHelper().getCurrent(composer, 6).getRedirectImageLoader();
            ImageRequest imageRequestBuild = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).memoryCacheKey(this.$sid).placeholderMemoryCacheKey(this.$sid).data(ImageContent5.Image$lambda$14(this.$imageSource$delegate)).size(Size.ORIGINAL).build();
            ContentScale fit = ContentScale.INSTANCE.getFit();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$bitmap) | composer.changed(this.$onFailImageLoad);
            final Bitmap bitmap = this.$bitmap;
            final Function0<Unit> function0 = this.$onFailImageLoad;
            final SnapshotState<Object> snapshotState = this.$imageSource$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$Image$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ImageContent5.C400611.invoke$lambda$2$lambda$1(bitmap, function0, snapshotState, (AsyncImagePainter.State) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ImageKt.Image(redirectImageLoader.rememberAsyncImagePainter(imageRequestBuild, fit, null, (Function1) objRememberedValue, composer, (RedirectImageLoader.$stable << 12) | 48, 4), this.$imageDescription, modifierFillMaxSize$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final Bitmap bitmap, Function0 function0, final SnapshotState snapshotState, AsyncImagePainter.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof AsyncImagePainter.State.Error) {
                ImageContent5.handleChatImageLoadError(((AsyncImagePainter.State.Error) state).getResult(), bitmap, new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$Image$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageContent5.C400611.invoke$lambda$2$lambda$1$lambda$0(bitmap, snapshotState);
                    }
                }, function0);
            } else if (!Intrinsics.areEqual(state, AsyncImagePainter.State.Empty.INSTANCE) && !(state instanceof AsyncImagePainter.State.Loading) && !(state instanceof AsyncImagePainter.State.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Bitmap bitmap, SnapshotState snapshotState) {
            ImageContent5.Image$lambda$15(snapshotState, bitmap);
            return Unit.INSTANCE;
        }
    }

    private static final void Error(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2079987921);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2079987921, i3, -1, "com.robinhood.shared.support.supportchat.ui.Error (ImageContent.kt:252)");
            }
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(TestTag3.testTag(modifier4, "ImageError"), PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_image_error_bubble_size, composerStartRestartGroup, 0));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifierM5169size3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.IMAGE_24), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_image_error_text_vertical_spacing, composerStartRestartGroup, 0), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_message_image_failed_to_load, composerStartRestartGroup, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ImageContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageContent5.Error$lambda$19(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getExpectedFinalImageSize--vR-za8, reason: not valid java name */
    public static final Tuples2<C2002Dp, C2002Dp> m25769getExpectedFinalImageSizevRza8(float f, float f2, float f3, float f4, Composer composer, int i) {
        Tuples2<C2002Dp, C2002Dp> tuples2M3642to;
        composer.startReplaceGroup(1585679968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1585679968, i, -1, "com.robinhood.shared.support.supportchat.ui.getExpectedFinalImageSize (ImageContent.kt:288)");
        }
        Tuples2<Integer, Integer> tuples2SelectThumbnailSize = selectThumbnailSize(composer, 0);
        int iIntValue = tuples2SelectThumbnailSize.component1().intValue();
        int iIntValue2 = tuples2SelectThumbnailSize.component2().intValue();
        float value = ((C2002Dp) RangesKt.coerceAtMost(C2002Dp.m7993boximpl(f3), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(iIntValue)))).getValue();
        float value2 = ((C2002Dp) RangesKt.coerceAtMost(C2002Dp.m7993boximpl(f4), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(iIntValue2)))).getValue();
        if (C2002Dp.m7994compareTo0680j_4(value, f) < 0 || C2002Dp.m7994compareTo0680j_4(value2, f2) < 0) {
            float f5 = f / f2;
            if (value / value2 > f5) {
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f5 * value2)), C2002Dp.m7993boximpl(value2));
            } else {
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(value), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(value / f5)));
            }
        } else {
            tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(f), C2002Dp.m7993boximpl(f2));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tuples2M3642to;
    }

    public static final void handleChatImageLoadError(ImageResult2 errorResult, Bitmap bitmap, Function0<Unit> fallbackOnBitmap, Function0<Unit> showError) {
        Intrinsics.checkNotNullParameter(errorResult, "errorResult");
        Intrinsics.checkNotNullParameter(fallbackOnBitmap, "fallbackOnBitmap");
        Intrinsics.checkNotNullParameter(showError, "showError");
        Object data = errorResult.getRequest().getData();
        if (!(data instanceof HttpUrl)) {
            if (data instanceof Bitmap) {
                showError.invoke();
            }
        } else if (bitmap != null) {
            fallbackOnBitmap.invoke();
        } else {
            showError.invoke();
        }
    }

    private static final Tuples2<Integer, Integer> selectThumbnailSize(Composer composer, int i) {
        Tuples2<Integer, Integer> thumbnail_size_medium;
        composer.startReplaceGroup(1063445339);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1063445339, i, -1, "com.robinhood.shared.support.supportchat.ui.selectThumbnailSize (ImageContent.kt:333)");
        }
        if (WindowSize.INSTANCE.getCurrentWidth(composer, 6) != WindowSize.Compact) {
            thumbnail_size_medium = ChatImageUtils.INSTANCE.getTHUMBNAIL_SIZE_LARGE();
        } else {
            thumbnail_size_medium = ChatImageUtils.INSTANCE.getTHUMBNAIL_SIZE_MEDIUM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return thumbnail_size_medium;
    }

    public static final ImageContent2 getLocalChatImageLoadHelper() {
        return LocalChatImageLoadHelper;
    }
}
