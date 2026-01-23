package com.robinhood.android.rhimage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import coil.compose.AsyncImagePainter;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import com.robinhood.utils.extensions.ResourceTypes;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* compiled from: ImageLoader.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&JI\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H'¢\u0006\u0002\u0010\u0017¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader;", "", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "url", "Lokhttp3/HttpUrl;", "path", "", "file", "Ljava/io/File;", "cancelRequest", "", "view", "Landroid/widget/ImageView;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "Builder", "ImageRequest", "Target", "Priority", "MemoryPolicy", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ImageLoader {

    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader$Builder;", "", "build", "Lcom/robinhood/android/rhimage/ImageLoader;", "okHttpClient", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Builder {
        ImageLoader build();

        Builder okHttpClient(Function0<? extends OkHttpClient> okHttpClient);
    }

    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H'¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader$Target;", "", "onStart", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "onError", "error", "onSuccess", "result", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public interface Target {
        void onError(Drawable error);

        void onStart(Drawable placeholder);

        void onSuccess(Drawable result);
    }

    void cancelRequest(ImageView view);

    ImageRequest load(File file);

    ImageRequest load(String path);

    ImageRequest load(HttpUrl url);

    AsyncImagePainter rememberAsyncImagePainter(Object obj, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, ContentScale contentScale, Composer composer, int i);

    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J,\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0000H&J\b\u0010\u0014\u001a\u00020\u0000H&J\b\u0010\u0015\u001a\u00020\u0000H&J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH&J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0000H&J\b\u0010\u001c\u001a\u00020\u0000H&J\b\u0010\u001d\u001a\u00020\u0000H&J\u0012\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020 H&¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader$ImageRequest;", "", "into", "", "target", "Landroid/widget/ImageView;", "onSuccess", "Lkotlin/Function0;", "onError", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "fetch", "memoryPolicy", "Lcom/robinhood/android/rhimage/ImageLoader$MemoryPolicy;", "placeholder", "drawableResId", "", "error", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "fit", "centerCrop", "centerInside", "size", "width", "height", "priority", "Lcom/robinhood/android/rhimage/ImageLoader$Priority;", "noFade", "noPlaceholder", "circle", "rounded", "radius", "", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public interface ImageRequest {
        ImageRequest centerCrop();

        ImageRequest centerInside();

        ImageRequest circle();

        ImageRequest error(int drawableResId);

        ImageRequest error(Drawable drawable);

        void fetch(Function0<Unit> onSuccess, Function0<Unit> onError);

        ImageRequest fit();

        void into(ImageView target, Function0<Unit> onSuccess, Function0<Unit> onError);

        void into(Target target);

        ImageRequest memoryPolicy(MemoryPolicy memoryPolicy);

        ImageRequest noFade();

        ImageRequest noPlaceholder();

        ImageRequest placeholder(int drawableResId);

        ImageRequest priority(Priority priority);

        ImageRequest rounded(float radius);

        ImageRequest size(int width, int height);

        /* compiled from: ImageLoader.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void into$default(ImageRequest imageRequest, ImageView imageView, Function0 function0, Function0 function02, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: into");
                }
                if ((i & 2) != 0) {
                    function0 = null;
                }
                if ((i & 4) != 0) {
                    function02 = null;
                }
                imageRequest.into(imageView, function0, function02);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void fetch$default(ImageRequest imageRequest, Function0 function0, Function0 function02, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
                }
                if ((i & 1) != 0) {
                    function0 = null;
                }
                if ((i & 2) != 0) {
                    function02 = null;
                }
                imageRequest.fetch(function0, function02);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader$Priority;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", TransferContext3.NORMAL, "HIGH", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Priority {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        public static final Priority LOW = new Priority("LOW", 0);
        public static final Priority NORMAL = new Priority(TransferContext3.NORMAL, 1);
        public static final Priority HIGH = new Priority("HIGH", 2);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{LOW, NORMAL, HIGH};
        }

        public static EnumEntries<Priority> getEntries() {
            return $ENTRIES;
        }

        private Priority(String str, int i) {
        }

        static {
            Priority[] priorityArr$values = $values();
            $VALUES = priorityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(priorityArr$values);
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageLoader.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhimage/ImageLoader$MemoryPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "NO_CACHE", "NO_STORE", "lib-rhimage_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class MemoryPolicy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MemoryPolicy[] $VALUES;
        public static final MemoryPolicy NO_CACHE = new MemoryPolicy("NO_CACHE", 0);
        public static final MemoryPolicy NO_STORE = new MemoryPolicy("NO_STORE", 1);

        private static final /* synthetic */ MemoryPolicy[] $values() {
            return new MemoryPolicy[]{NO_CACHE, NO_STORE};
        }

        public static EnumEntries<MemoryPolicy> getEntries() {
            return $ENTRIES;
        }

        private MemoryPolicy(String str, int i) {
        }

        static {
            MemoryPolicy[] memoryPolicyArr$values = $values();
            $VALUES = memoryPolicyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(memoryPolicyArr$values);
        }

        public static MemoryPolicy valueOf(String str) {
            return (MemoryPolicy) Enum.valueOf(MemoryPolicy.class, str);
        }

        public static MemoryPolicy[] values() {
            return (MemoryPolicy[]) $VALUES.clone();
        }
    }
}
