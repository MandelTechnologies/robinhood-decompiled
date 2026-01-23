package com.robinhood.android.store.matcha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p320db.matcha.EncryptedUserId;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QrCodeStore.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001dJ\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'0\u001dH\u0002J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001d2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\"H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u000fH\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010*\u001a\u00020\"H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R1\u0010\u0014\u001a\u0018\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u0016\u0012\u0006\b\u0001\u0012\u00020\u00180\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/QrCodeStore;", "Lcom/robinhood/store/Store;", "context", "Landroid/content/Context;", "encryptedUserIdStore", "Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/store/matcha/EncryptedUserIdStore;Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/store/StoreBundle;)V", "getContext", "()Landroid/content/Context;", "qrCodeSize", "", "getQrCodeSize", "()I", "qrCodeSize$delegate", "Lkotlin/Lazy;", "hints", "Ljava/util/EnumMap;", "Lcom/google/zxing/EncodeHintType;", "kotlin.jvm.PlatformType", "", "getHints", "()Ljava/util/EnumMap;", "hints$delegate", "getBitmap", "Lio/reactivex/Single;", "Landroid/graphics/Bitmap;", "createDeepLink", "Lkotlin/Function1;", "Lcom/robinhood/models/db/matcha/EncryptedUserId;", "", "getBitmapUncached", "getPdf", "Ljava/io/File;", "readBitmapFromDisk", "Lcom/robinhood/utils/Optional;", "savePdfToDisk", "bitmap", "fileName", "createQrCodeBitmap", "contents", "size", "deleteFile", "", "Companion", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QrCodeStore extends Store {
    private static final String BITMAP_FILE_NAME = "profile_qr_code";
    private static final String PDF_FILE_NAME = "profile_qr_code.pdf";
    private final BitmapStore bitmapStore;
    private final Context context;
    private final EncryptedUserIdStore encryptedUserIdStore;

    /* renamed from: hints$delegate, reason: from kotlin metadata */
    private final Lazy hints;

    /* renamed from: qrCodeSize$delegate, reason: from kotlin metadata */
    private final Lazy qrCodeSize;

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeStore(Context context, EncryptedUserIdStore encryptedUserIdStore, BitmapStore bitmapStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedUserIdStore, "encryptedUserIdStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.context = context;
        this.encryptedUserIdStore = encryptedUserIdStore;
        this.bitmapStore = bitmapStore;
        this.qrCodeSize = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.store.matcha.QrCodeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(QrCodeStore.qrCodeSize_delegate$lambda$0(this.f$0));
            }
        });
        this.hints = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.store.matcha.QrCodeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QrCodeStore.hints_delegate$lambda$1();
            }
        });
        ScopedSubscriptionKt.subscribeIn(getLogoutKillswitch().getKillswitchObservable(), getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.QrCodeStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QrCodeStore._init_$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getQrCodeSize() {
        return ((Number) this.qrCodeSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int qrCodeSize_delegate$lambda$0(QrCodeStore qrCodeStore) {
        return qrCodeStore.context.getResources().getDimensionPixelSize(C28766R.dimen.matcha_qr_code_size);
    }

    private final EnumMap<EncodeHintType, ? extends Object> getHints() {
        return (EnumMap) this.hints.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumMap hints_delegate$lambda$1() {
        Tuples2[] tuples2Arr = {Tuples4.m3642to(EncodeHintType.MARGIN, 2), Tuples4.m3642to(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M), Tuples4.m3642to(EncodeHintType.CHARACTER_SET, CharacterSetECI.UTF8)};
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        MapsKt.putAll(enumMap, tuples2Arr);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(QrCodeStore qrCodeStore, boolean z) {
        qrCodeStore.deleteFile(BITMAP_FILE_NAME);
        qrCodeStore.deleteFile(PDF_FILE_NAME);
        return Unit.INSTANCE;
    }

    public final Single<Bitmap> getBitmap(final Function1<? super EncryptedUserId, String> createDeepLink) {
        Intrinsics.checkNotNullParameter(createDeepLink, "createDeepLink");
        Single singleFlatMap = readBitmapFromDisk().flatMap(new Function() { // from class: com.robinhood.android.store.matcha.QrCodeStore.getBitmap.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Bitmap> apply(Optional<Bitmap> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Bitmap bitmapComponent1 = optional.component1();
                if (bitmapComponent1 != null) {
                    return Single.just(bitmapComponent1);
                }
                Single<EncryptedUserId> singleFirstOrError = QrCodeStore.this.encryptedUserIdStore.stream().firstOrError();
                final QrCodeStore qrCodeStore = QrCodeStore.this;
                final Function1<EncryptedUserId, String> function1 = createDeepLink;
                return singleFirstOrError.flatMap(new Function() { // from class: com.robinhood.android.store.matcha.QrCodeStore.getBitmap.1.1

                    /* compiled from: QrCodeStore.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.QrCodeStore$getBitmap$1$1$1", m3645f = "QrCodeStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.store.matcha.QrCodeStore$getBitmap$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C505491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
                        final /* synthetic */ Function1<EncryptedUserId, String> $createDeepLink;
                        final /* synthetic */ EncryptedUserId $userId;
                        Object L$0;
                        int label;
                        final /* synthetic */ QrCodeStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C505491(QrCodeStore qrCodeStore, Function1<? super EncryptedUserId, String> function1, EncryptedUserId encryptedUserId, Continuation<? super C505491> continuation) {
                            super(2, continuation);
                            this.this$0 = qrCodeStore;
                            this.$createDeepLink = function1;
                            this.$userId = encryptedUserId;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C505491(this.this$0, this.$createDeepLink, this.$userId, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
                            return ((C505491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) throws NumberFormatException, WriterException {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Bitmap bitmap = (Bitmap) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                return bitmap;
                            }
                            ResultKt.throwOnFailure(obj);
                            QrCodeStore qrCodeStore = this.this$0;
                            Function1<EncryptedUserId, String> function1 = this.$createDeepLink;
                            EncryptedUserId encryptedUserId = this.$userId;
                            Intrinsics.checkNotNull(encryptedUserId);
                            Bitmap bitmapCreateQrCodeBitmap = qrCodeStore.createQrCodeBitmap(function1.invoke(encryptedUserId), this.this$0.getQrCodeSize());
                            BitmapStore bitmapStore = this.this$0.bitmapStore;
                            this.L$0 = bitmapCreateQrCodeBitmap;
                            this.label = 1;
                            return bitmapStore.saveBitmapToDisk(bitmapCreateQrCodeBitmap, QrCodeStore.BITMAP_FILE_NAME, this) == coroutine_suspended ? coroutine_suspended : bitmapCreateQrCodeBitmap;
                        }
                    }

                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends Bitmap> apply(EncryptedUserId userId) {
                        Intrinsics.checkNotNullParameter(userId, "userId");
                        QrCodeStore qrCodeStore2 = qrCodeStore;
                        return RxFactory.DefaultImpls.rxSingle$default(qrCodeStore2, null, new C505491(qrCodeStore2, function1, userId, null), 1, null);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Single<Bitmap> getBitmapUncached(final Function1<? super EncryptedUserId, String> createDeepLink) {
        Intrinsics.checkNotNullParameter(createDeepLink, "createDeepLink");
        Single map = this.encryptedUserIdStore.stream().firstOrError().map(new Function() { // from class: com.robinhood.android.store.matcha.QrCodeStore.getBitmapUncached.1
            @Override // io.reactivex.functions.Function
            public final Bitmap apply(EncryptedUserId userId) {
                Intrinsics.checkNotNullParameter(userId, "userId");
                return QrCodeStore.this.createQrCodeBitmap(createDeepLink.invoke(userId), QrCodeStore.this.getQrCodeSize());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<File> getPdf() {
        final File file = new File(this.context.getFilesDir(), PDF_FILE_NAME);
        if (file.exists()) {
            Single<File> singleJust = Single.just(file);
            Intrinsics.checkNotNull(singleJust);
            return singleJust;
        }
        Single singleFlatMap = readBitmapFromDisk().flatMap(new Function() { // from class: com.robinhood.android.store.matcha.QrCodeStore.getPdf.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(Optional<Bitmap> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Bitmap bitmapComponent1 = optional.component1();
                if (bitmapComponent1 != null) {
                    QrCodeStore qrCodeStore = QrCodeStore.this;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    return qrCodeStore.savePdfToDisk(bitmapComponent1, name);
                }
                Single singleError = Single.error(new FileNotFoundException());
                Intrinsics.checkNotNull(singleError);
                return singleError;
            }
        });
        Intrinsics.checkNotNull(singleFlatMap);
        return singleFlatMap;
    }

    /* compiled from: QrCodeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.QrCodeStore$readBitmapFromDisk$1", m3645f = "QrCodeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.matcha.QrCodeStore$readBitmapFromDisk$1 */
    static final class C287631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Bitmap>>, Object> {
        Object L$0;
        int label;

        C287631(Continuation<? super C287631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QrCodeStore.this.new C287631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Bitmap>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Bitmap>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Bitmap>> continuation) {
            return ((C287631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                BitmapStore bitmapStore = QrCodeStore.this.bitmapStore;
                this.L$0 = companion2;
                this.label = 1;
                Object bitmapFromDisk = bitmapStore.readBitmapFromDisk(QrCodeStore.BITMAP_FILE_NAME, this);
                if (bitmapFromDisk == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = bitmapFromDisk;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    private final Single<Optional<Bitmap>> readBitmapFromDisk() {
        Single<Optional<Bitmap>> singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C287631(null), 1, null).subscribeOn(Schedulers.m3346io()).onErrorReturn(new Function() { // from class: com.robinhood.android.store.matcha.QrCodeStore.readBitmapFromDisk.2
            @Override // io.reactivex.functions.Function
            public final Optional<Bitmap> apply(Throwable it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof FileNotFoundException) {
                    return Optional2.INSTANCE;
                }
                throw it;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        return singleOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<File> savePdfToDisk(Bitmap bitmap, final String fileName) {
        final PdfDocument pdfDocument = new PdfDocument();
        PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(getQrCodeSize(), getQrCodeSize(), 1).create());
        pageStartPage.getCanvas().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        pdfDocument.finishPage(pageStartPage);
        Single<File> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.store.matcha.QrCodeStore.savePdfToDisk.1
            /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:31|3)|(2:33|4)|29|5|(2:23|35)(2:24|25)|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
            @Override // io.reactivex.SingleOnSubscribe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void subscribe(SingleEmitter<File> emitter) throws Throwable {
                BufferedOutputStream bufferedOutputStream;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                BufferedOutputStream bufferedOutputStream2 = null;
                IOException e = null;
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = QrCodeStore.this.getContext().openFileOutput(fileName, 0);
                    Intrinsics.checkNotNullExpressionValue(fileOutputStreamOpenFileOutput, "openFileOutput(...)");
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenFileOutput, 8192);
                } catch (IOException e2) {
                    bufferedOutputStream = null;
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    pdfDocument.writeTo(bufferedOutputStream);
                    pdfDocument.close();
                } catch (IOException e3) {
                    e = e3;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (e == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
                bufferedOutputStream.close();
                if (e == null) {
                    emitter.onError(e);
                } else {
                    emitter.onSuccess(new File(QrCodeStore.this.getContext().getFilesDir(), fileName));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createQrCodeBitmap(String contents, int size) throws NumberFormatException, WriterException {
        BitMatrix bitMatrixEncode = new QRCodeWriter().encode(contents, BarcodeFormat.QR_CODE, size, size, getHints());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitMatrixEncode.getWidth(), bitMatrixEncode.getHeight(), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int height = bitMatrixEncode.getHeight();
        for (int i = 0; i < height; i++) {
            int width = bitMatrixEncode.getWidth();
            for (int i2 = 0; i2 < width; i2++) {
                bitmapCreateBitmap.setPixel(i2, i, bitMatrixEncode.get(i2, i) ? -16777216 : -1);
            }
        }
        float f = size;
        int i3 = (int) (0.25f * f);
        float f2 = f / 2.0f;
        float f3 = i3 / 2.0f;
        int i4 = (int) (f2 - f3);
        int i5 = (int) (f2 + f3);
        Drawable drawable = this.context.getDrawable(C28766R.drawable.overlay);
        Intrinsics.checkNotNull(drawable);
        drawable.setBounds(i4, i4, i5, i5);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private final void deleteFile(String fileName) {
        new File(this.context.getFilesDir(), fileName).delete();
    }
}
