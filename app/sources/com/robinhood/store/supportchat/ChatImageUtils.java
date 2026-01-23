package com.robinhood.store.supportchat;

import android.graphics.Bitmap;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.Bitmaps4;
import com.robinhood.utils.http.MediaTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ChatImageUtils.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\rR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/supportchat/ChatImageUtils;", "", "<init>", "()V", "generateUnsentImageFileName", "", InquiryField.DateField.TYPE, "Ljava/util/Date;", "createFileRequestBody", "Lokhttp3/MultipartBody$Part;", "bitmap", "Landroid/graphics/Bitmap;", "createThumbnailPart", "", "sizes", "Lkotlin/Pair;", "", "THUMBNAIL_SIZE_SMALL", "THUMBNAIL_SIZE_MEDIUM", "getTHUMBNAIL_SIZE_MEDIUM", "()Lkotlin/Pair;", "THUMBNAIL_SIZE_LARGE", "getTHUMBNAIL_SIZE_LARGE", "THUMBNAIL_SIZE_SET", "getTHUMBNAIL_SIZE_SET", "()Ljava/util/List;", "SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME", "TEMP_UNSENT_IMAGE_FILE_DIR", "IMG_REFERENCE_INSTANCE", "IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES", "", "IMG_FILE_FORM_DATA_NAME", "IMG_FILE_FORM_DATA_FILE_NAME", "THUMBNAIL_SIZE_NAME", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ChatImageUtils {
    public static final long IMAGE_FILE_FINAL_SIZE_LIMIT_IN_BYTES = 10000000;
    private static final String IMG_FILE_FORM_DATA_FILE_NAME = "file.png";
    private static final String IMG_FILE_FORM_DATA_NAME = "data";
    public static final String IMG_REFERENCE_INSTANCE = "cx_chat";
    public static final ChatImageUtils INSTANCE = new ChatImageUtils();
    public static final String SUPPORT_CAMERA_IMAGE_DIRECTORY_NAME = "temp_support_camera_image_dir";
    public static final String TEMP_UNSENT_IMAGE_FILE_DIR = "temp_support_unsent_img_file_dir";
    private static final Tuples2<Integer, Integer> THUMBNAIL_SIZE_LARGE;
    private static final Tuples2<Integer, Integer> THUMBNAIL_SIZE_MEDIUM;
    private static final String THUMBNAIL_SIZE_NAME = "thumbnail_sizes";
    private static final List<Tuples2<Integer, Integer>> THUMBNAIL_SIZE_SET;
    private static final Tuples2<Integer, Integer> THUMBNAIL_SIZE_SMALL;

    private ChatImageUtils() {
    }

    public static /* synthetic */ String generateUnsentImageFileName$default(ChatImageUtils chatImageUtils, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = new Date();
        }
        return chatImageUtils.generateUnsentImageFileName(date);
    }

    public final String generateUnsentImageFileName(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return "temp_unsent_support_image_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(date);
    }

    public final MultipartBody.Part createFileRequestBody(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return MultipartBody.Part.INSTANCE.createFormData("data", IMG_FILE_FORM_DATA_FILE_NAME, RequestBody.Companion.create$default(RequestBody.INSTANCE, Bitmaps4.getAsByteArray(bitmap), MediaTypes.INSTANCE.getPNG(), 0, 0, 6, (Object) null));
    }

    public final List<MultipartBody.Part> createThumbnailPart(List<Tuples2<Integer, Integer>> sizes) {
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : sizes) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) obj;
            int iIntValue = ((Number) tuples2.component1()).intValue();
            int iIntValue2 = ((Number) tuples2.component2()).intValue();
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            arrayList.add(companion.createFormData("thumbnail_sizes[" + i + "]width", String.valueOf(iIntValue)));
            arrayList.add(companion.createFormData("thumbnail_sizes[" + i + "]height", String.valueOf(iIntValue2)));
            i = i2;
        }
        return arrayList;
    }

    static {
        Integer numValueOf = Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        Tuples2<Integer, Integer> tuples2M3642to = Tuples4.m3642to(numValueOf, numValueOf);
        THUMBNAIL_SIZE_SMALL = tuples2M3642to;
        Tuples2<Integer, Integer> tuples2M3642to2 = Tuples4.m3642to(480, 480);
        THUMBNAIL_SIZE_MEDIUM = tuples2M3642to2;
        Tuples2<Integer, Integer> tuples2M3642to3 = Tuples4.m3642to(960, 960);
        THUMBNAIL_SIZE_LARGE = tuples2M3642to3;
        THUMBNAIL_SIZE_SET = CollectionsKt.listOf((Object[]) new Tuples2[]{tuples2M3642to, tuples2M3642to2, tuples2M3642to3});
    }

    public final Tuples2<Integer, Integer> getTHUMBNAIL_SIZE_MEDIUM() {
        return THUMBNAIL_SIZE_MEDIUM;
    }

    public final Tuples2<Integer, Integer> getTHUMBNAIL_SIZE_LARGE() {
        return THUMBNAIL_SIZE_LARGE;
    }

    public final List<Tuples2<Integer, Integer>> getTHUMBNAIL_SIZE_SET() {
        return THUMBNAIL_SIZE_SET;
    }
}
