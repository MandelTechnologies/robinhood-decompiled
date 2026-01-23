package com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.RealFontDownloader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Interruptible;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: RealFontDownloader.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0004*+,-B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00170\u001fH\u0017J\u0018\u0010!\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u001e\u0010'\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010(\u001a\u00020&H\u0082@¢\u0006\u0002\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RN\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n0\t0\t2\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n0\t0\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/FontDownloader;", "okHttpClient", "Lokhttp3/OkHttpClient;", "context", "Landroid/app/Application;", "<init>", "(Lokhttp3/OkHttpClient;Landroid/app/Application;)V", "value", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontDownloaderMapping", "getFontDownloaderMapping", "()Ljava/util/Map;", "fontCache", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState;", "onFontDownloadedCallbacks", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloadedCallback;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "saveState", "", "outState", "Landroid/os/Bundle;", "restoreState", "inState", "downloadFont", "fontUrl", "onSuccess", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "updateMapping", "remoteFonts", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RemoteFont;", "getFontFile", "Ljava/io/File;", "downloadFontFile", "destinationFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FontDownloaderState", "Companion", "FontDownloadedCallback", "FontState", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class RealFontDownloader implements FontDownloader {
    private final Application context;
    private final CoroutineScope coroutineScope;
    private final Map<String, FontState> fontCache;
    private Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;
    private final OkHttpClient okHttpClient;
    private final List<FontDownloadedCallback> onFontDownloadedCallbacks;

    /* compiled from: RealFontDownloader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader", m3645f = "RealFontDownloader.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "downloadFontFile")
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFontFile$1 */
    static final class C437741 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C437741(Continuation<? super C437741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealFontDownloader.this.downloadFontFile(null, null, this);
        }
    }

    public RealFontDownloader(OkHttpClient okHttpClient, Application context) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(context, "context");
        this.okHttpClient = okHttpClient;
        this.context = context;
        this.fontDownloaderMapping = new LinkedHashMap();
        this.fontCache = new LinkedHashMap();
        this.onFontDownloadedCallbacks = new ArrayList();
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    /* compiled from: RealFontDownloader.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloaderState;", "Landroid/os/Parcelable;", "fontDownloaderMapping", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "(Ljava/util/Map;)V", "getFontDownloaderMapping", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private static final class FontDownloaderState implements Parcelable {
        public static final Parcelable.Creator<FontDownloaderState> CREATOR = new Creator();
        private final Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping;

        /* compiled from: RealFontDownloader.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FontDownloaderState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontDownloaderState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap2.put(StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readString());
                    }
                    linkedHashMap.put(string2, linkedHashMap2);
                }
                return new FontDownloaderState(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontDownloaderState[] newArray(int i) {
                return new FontDownloaderState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<String, Map<StyleElements.FontWeight, String>> map = this.fontDownloaderMapping;
            dest.writeInt(map.size());
            for (Map.Entry<String, Map<StyleElements.FontWeight, String>> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                Map<StyleElements.FontWeight, String> value = entry.getValue();
                dest.writeInt(value.size());
                for (Map.Entry<StyleElements.FontWeight, String> entry2 : value.entrySet()) {
                    dest.writeString(entry2.getKey().name());
                    dest.writeString(entry2.getValue());
                }
            }
        }

        public FontDownloaderState(Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping) {
            Intrinsics.checkNotNullParameter(fontDownloaderMapping, "fontDownloaderMapping");
            this.fontDownloaderMapping = fontDownloaderMapping;
        }

        public final Map<String, Map<StyleElements.FontWeight, String>> getFontDownloaderMapping() {
            return this.fontDownloaderMapping;
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader
    public Map<String, Map<StyleElements.FontWeight, String>> getFontDownloaderMapping() {
        return this.fontDownloaderMapping;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader
    public void saveState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("font_downloader_mapping", new FontDownloaderState(getFontDownloaderMapping()));
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader
    public void restoreState(Bundle inState) {
        Map<String, Map<StyleElements.FontWeight, String>> linkedHashMap;
        FontDownloaderState fontDownloaderState;
        if (inState == null || (fontDownloaderState = (FontDownloaderState) BundleCompat.getParcelable(inState, "font_downloader_mapping", FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.getFontDownloaderMapping()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.fontDownloaderMapping = linkedHashMap;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader
    public void downloadFont(String fontUrl, Function1<? super Typeface, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(fontUrl, "fontUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        FontState fontState = this.fontCache.get(fontUrl);
        if (fontState instanceof FontState.Cached) {
            onSuccess.invoke(((FontState.Cached) fontState).getTypeface());
            return;
        }
        FontState.Downloading downloading = FontState.Downloading.INSTANCE;
        if (Intrinsics.areEqual(fontState, downloading)) {
            this.onFontDownloadedCallbacks.add(new FontDownloadedCallback(fontUrl, onSuccess));
        } else {
            if (fontState != null) {
                throw new NoWhenBranchMatchedException();
            }
            this.fontCache.put(fontUrl, downloading);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C437731(fontUrl, onSuccess, null), 3, null);
        }
    }

    /* compiled from: RealFontDownloader.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1", m3645f = "RealFontDownloader.kt", m3646l = {86, 92}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1 */
    static final class C437731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $fontUrl;
        final /* synthetic */ Function1<Typeface, Unit> $onSuccess;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437731(String str, Function1<? super Typeface, Unit> function1, Continuation<? super C437731> continuation) {
            super(2, continuation);
            this.$fontUrl = str;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealFontDownloader.this.new C437731(this.$fontUrl, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r11, r4, r10) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            File fontFile;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception unused) {
                RealFontDownloader.this.fontCache.put(this.$fontUrl, null);
                List list = RealFontDownloader.this.onFontDownloadedCallbacks;
                final String str = this.$fontUrl;
                CollectionsKt.removeAll(list, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(RealFontDownloader.C437731.invokeSuspend$lambda$0(str, (RealFontDownloader.FontDownloadedCallback) obj2));
                    }
                });
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                fontFile = RealFontDownloader.this.getFontFile();
                RealFontDownloader realFontDownloader = RealFontDownloader.this;
                String str2 = this.$fontUrl;
                this.L$0 = fontFile;
                this.label = 1;
                if (realFontDownloader.downloadFontFile(str2, fontFile, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            fontFile = (File) this.L$0;
            ResultKt.throwOnFailure(obj);
            Typeface typefaceCreateFromFile = Typeface.createFromFile(fontFile);
            Map map = RealFontDownloader.this.fontCache;
            String str3 = this.$fontUrl;
            Intrinsics.checkNotNull(typefaceCreateFromFile);
            map.put(str3, new FontState.Cached(typefaceCreateFromFile));
            fontFile.delete();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSuccess, typefaceCreateFromFile, RealFontDownloader.this, this.$fontUrl, null);
            this.L$0 = null;
            this.label = 2;
        }

        /* compiled from: RealFontDownloader.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1", m3645f = "RealFontDownloader.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $fontUrl;
            final /* synthetic */ Function1<Typeface, Unit> $onSuccess;
            final /* synthetic */ Typeface $typeface;
            int label;
            final /* synthetic */ RealFontDownloader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super Typeface, Unit> function1, Typeface typeface, RealFontDownloader realFontDownloader, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$onSuccess = function1;
                this.$typeface = typeface;
                this.this$0 = realFontDownloader;
                this.$fontUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$onSuccess, this.$typeface, this.this$0, this.$fontUrl, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<Typeface, Unit> function1 = this.$onSuccess;
                Typeface typeface = this.$typeface;
                Intrinsics.checkNotNull(typeface);
                function1.invoke(typeface);
                List list = this.this$0.onFontDownloadedCallbacks;
                String str = this.$fontUrl;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((FontDownloadedCallback) obj2).getUrl(), str)) {
                        arrayList.add(obj2);
                    }
                }
                List list2 = this.this$0.onFontDownloadedCallbacks;
                final String str2 = this.$fontUrl;
                CollectionsKt.removeAll(list2, new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(RealFontDownloader.C437731.AnonymousClass1.invokeSuspend$lambda$1(str2, (RealFontDownloader.FontDownloadedCallback) obj3));
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Function1<Typeface, Unit> onFontDownloaded = ((FontDownloadedCallback) it.next()).getOnFontDownloaded();
                    Typeface typeface2 = this.$typeface;
                    Intrinsics.checkNotNull(typeface2);
                    onFontDownloaded.invoke(typeface2);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1(String str, FontDownloadedCallback fontDownloadedCallback) {
                return Intrinsics.areEqual(fontDownloadedCallback.getUrl(), str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(String str, FontDownloadedCallback fontDownloadedCallback) {
            return Intrinsics.areEqual(fontDownloadedCallback.getUrl(), str);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts.FontDownloader
    public void updateMapping(List<RemoteFont> remoteFonts) {
        if (remoteFonts == null) {
            remoteFonts = CollectionsKt.emptyList();
        }
        for (RemoteFont remoteFont : remoteFonts) {
            String fontFamilyName = remoteFont.getFontFamilyName();
            String url = remoteFont.getUrl();
            StyleElements.FontWeight fontWeight = remoteFont.getFontWeight();
            if (fontFamilyName != null && url != null && fontWeight != null) {
                Map<String, Map<StyleElements.FontWeight, String>> fontDownloaderMapping = getFontDownloaderMapping();
                Map<StyleElements.FontWeight, String> linkedHashMap = fontDownloaderMapping.get(fontFamilyName);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    fontDownloaderMapping.put(fontFamilyName, linkedHashMap);
                }
                linkedHashMap.put(fontWeight, url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFontFile() {
        File file = new File(new File(this.context.getCacheDir(), ".com.withpersona.sdk2.inquiry"), "fonts");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadFontFile(String str, File file, Continuation<? super Unit> continuation) {
        C437741 c437741;
        if (continuation instanceof C437741) {
            c437741 = (C437741) continuation;
            int i = c437741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c437741.label = i - Integer.MIN_VALUE;
            } else {
                c437741 = new C437741(continuation);
            }
        }
        Object objRunInterruptible = c437741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c437741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRunInterruptible);
            final Request requestBuild = new Request.Builder().url(str).build();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealFontDownloader.downloadFontFile$lambda$1(this.f$0, requestBuild);
                }
            };
            c437741.L$0 = file;
            c437741.label = 1;
            objRunInterruptible = Interruptible.runInterruptible(io2, function0, c437741);
            if (objRunInterruptible == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) c437741.L$0;
            ResultKt.throwOnFailure(objRunInterruptible);
        }
        Response response = (Response) objRunInterruptible;
        try {
            ResponseBody body = response.getBody();
            InputStream inputStreamByteStream = body != null ? body.byteStream() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (inputStreamByteStream != null) {
                    try {
                        boxing.boxLong(IOStreams.copyTo$default(inputStreamByteStream, fileOutputStream, 0, 2, null));
                    } finally {
                    }
                }
                Closeable.closeFinally(fileOutputStream, null);
                Closeable.closeFinally(inputStreamByteStream, null);
                Closeable.closeFinally(response, null);
                return Unit.INSTANCE;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response downloadFontFile$lambda$1(RealFontDownloader realFontDownloader, Request request) {
        return realFontDownloader.okHttpClient.newCall(request).execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealFontDownloader.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontDownloadedCallback;", "", "url", "", "onFontDownloaded", "Lkotlin/Function1;", "Landroid/graphics/Typeface;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getUrl", "()Ljava/lang/String;", "getOnFontDownloaded", "()Lkotlin/jvm/functions/Function1;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    static final class FontDownloadedCallback {
        private final Function1<Typeface, Unit> onFontDownloaded;
        private final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public FontDownloadedCallback(String url, Function1<? super Typeface, Unit> onFontDownloaded) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(onFontDownloaded, "onFontDownloaded");
            this.url = url;
            this.onFontDownloaded = onFontDownloaded;
        }

        public final Function1<Typeface, Unit> getOnFontDownloaded() {
            return this.onFontDownloaded;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: RealFontDownloader.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState;", "", "Downloading", "Cached", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState$Cached;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState$Downloading;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    private interface FontState {

        /* compiled from: RealFontDownloader.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState$Downloading;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Downloading implements FontState {
            public static final Downloading INSTANCE = new Downloading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Downloading);
            }

            public int hashCode() {
                return 1662305117;
            }

            public String toString() {
                return "Downloading";
            }

            private Downloading() {
            }
        }

        /* compiled from: RealFontDownloader.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState$Cached;", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RealFontDownloader$FontState;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Cached implements FontState {
            private final Typeface typeface;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cached) && Intrinsics.areEqual(this.typeface, ((Cached) other).typeface);
            }

            public int hashCode() {
                return this.typeface.hashCode();
            }

            public String toString() {
                return "Cached(typeface=" + this.typeface + ")";
            }

            public Cached(Typeface typeface) {
                Intrinsics.checkNotNullParameter(typeface, "typeface");
                this.typeface = typeface;
            }

            public final Typeface getTypeface() {
                return this.typeface;
            }
        }
    }
}
