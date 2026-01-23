package com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo;
import com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingViewState;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: WalletEnrollmentLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\f0\nH\u0002¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingViewState;", "<init>", "()V", "startDownloading", "", "context", "Landroid/content/Context;", "ordered", "", "Landroid/net/Uri;", "Ljava/io/File;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class WalletEnrollmentLoadingDuxo extends OldBaseDuxo<WalletEnrollmentLoadingViewState> {
    private static final float ANIMATION_SPEED_SLOW = 0.05f;
    private static final String FILE_EXTENSION = ".mp4";
    private static final float LOADING_PROGRESS_THRESHOLD = 0.6f;
    private static final String ROOT_DIRECTORY = "wallet_enrollment";
    public static final int $stable = OldBaseDuxo.$stable;
    private static final List<String> fileNames = CollectionsKt.listOf((Object[]) new String[]{"transition_03", "loop_03"});

    /* JADX WARN: Multi-variable type inference failed */
    public WalletEnrollmentLoadingDuxo() {
        super(new WalletEnrollmentLoadingViewState.Downloading(0.0f, true, 1, null), null, 2, 0 == true ? 1 : 0);
    }

    public final void startDownloading(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(context.getExternalCacheDir(), ROOT_DIRECTORY);
        file.mkdirs();
        Single list = Observable.fromIterable(fileNames).flatMapSingle(new Function() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo.startDownloading.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final File file2 = new File(file, it + WalletEnrollmentLoadingDuxo.FILE_EXTENSION);
                if (file2.exists()) {
                    return Single.fromCallable(new Callable() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo.startDownloading.1.1
                        @Override // java.util.concurrent.Callable
                        public final File call() {
                            return file2;
                        }
                    });
                }
                return Single.create(new DownloadManagerOnSubscribe(context, Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment("wallet_enrollment/" + it + WalletEnrollmentLoadingDuxo.FILE_EXTENSION).build(), file2, false));
            }
        }).doOnNext(new C380182(new Ref.FloatRef(), this)).toList();
        Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
        bind(list, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletEnrollmentLoadingDuxo.startDownloading$lambda$1(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletEnrollmentLoadingDuxo.startDownloading$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: WalletEnrollmentLoadingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$startDownloading$2 */
    static final class C380182<T> implements Consumer {
        final /* synthetic */ Ref.FloatRef $downloadedFilesCount;
        final /* synthetic */ WalletEnrollmentLoadingDuxo this$0;

        C380182(Ref.FloatRef floatRef, WalletEnrollmentLoadingDuxo walletEnrollmentLoadingDuxo) {
            this.$downloadedFilesCount = floatRef;
            this.this$0 = walletEnrollmentLoadingDuxo;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(File file) {
            Ref.FloatRef floatRef = this.$downloadedFilesCount;
            float f = floatRef.element + 1.0f;
            floatRef.element = f;
            if (f / WalletEnrollmentLoadingDuxo.fileNames.size() > WalletEnrollmentLoadingDuxo.LOADING_PROGRESS_THRESHOLD) {
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$startDownloading$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WalletEnrollmentLoadingDuxo.C380182.accept$lambda$0((WalletEnrollmentLoadingViewState) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WalletEnrollmentLoadingViewState accept$lambda$0(WalletEnrollmentLoadingViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return new WalletEnrollmentLoadingViewState.Downloading(0.05f, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownloading$lambda$1(final WalletEnrollmentLoadingDuxo walletEnrollmentLoadingDuxo, final List list) {
        walletEnrollmentLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletEnrollmentLoadingDuxo.startDownloading$lambda$1$lambda$0(this.f$0, list, (WalletEnrollmentLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletEnrollmentLoadingViewState startDownloading$lambda$1$lambda$0(WalletEnrollmentLoadingDuxo walletEnrollmentLoadingDuxo, List list, WalletEnrollmentLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return new WalletEnrollmentLoadingViewState.Completed(walletEnrollmentLoadingDuxo.ordered(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownloading$lambda$3(WalletEnrollmentLoadingDuxo walletEnrollmentLoadingDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        walletEnrollmentLoadingDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletEnrollmentLoadingDuxo.startDownloading$lambda$3$lambda$2(error, (WalletEnrollmentLoadingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletEnrollmentLoadingViewState startDownloading$lambda$3$lambda$2(Throwable th, WalletEnrollmentLoadingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new WalletEnrollmentLoadingViewState.Failed(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        r1.add(android.net.Uri.fromFile(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Uri> ordered(List<? extends File> list) {
        List<String> list2 = fileNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            for (File file : list) {
                String path = file.getPath();
                Intrinsics.checkNotNull(path);
                String strSubstring = path.substring(StringsKt.lastIndexOf$default((CharSequence) path, "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (Intrinsics.areEqual(strSubstring, str + FILE_EXTENSION)) {
                    break;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return arrayList;
    }
}
