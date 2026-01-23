package com.robinhood.android.common.emojipicker;

import android.content.res.AssetManager;
import com.robinhood.android.common.emojipicker.CuratedListEmojiProvider;
import com.robinhood.utils.Okio2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.sequences.SequencesKt;
import okio.BufferedSource;

/* compiled from: CuratedListEmojiProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiProvider;", "", "assetManager", "Landroid/content/res/AssetManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Landroid/content/res/AssetManager;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "getEmojiGroups", "Lio/reactivex/Single;", "", "Lcom/robinhood/android/common/emojipicker/EmojiGroup;", "Companion", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CuratedListEmojiProvider {
    private static final String EMOJIS_FILE_NAME = "emoji-categories-mobile.json";
    private final AssetManager assetManager;
    private final LazyMoshi moshi;
    public static final int $stable = 8;

    public CuratedListEmojiProvider(AssetManager assetManager, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.assetManager = assetManager;
        this.moshi = moshi;
    }

    /* compiled from: CuratedListEmojiProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.emojipicker.CuratedListEmojiProvider$getEmojiGroups$1 */
    static final class CallableC111461<V> implements Callable {
        CallableC111461() {
        }

        @Override // java.util.concurrent.Callable
        public final List<EmojiGroup> call() throws IOException {
            LazyMoshi lazyMoshi = CuratedListEmojiProvider.this.moshi;
            Types types = Types.INSTANCE;
            JsonAdapter jsonAdapterAdapter = lazyMoshi.adapter(new TypeToken<List<? extends EmojiGroup>>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiProvider$getEmojiGroups$1$call$$inlined$getAdapter$1
            }.getType());
            InputStream inputStreamOpen = CuratedListEmojiProvider.this.assetManager.open(CuratedListEmojiProvider.EMOJIS_FILE_NAME);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            BufferedSource bufferedSource = Okio2.bufferedSource(inputStreamOpen);
            try {
                Object objFromJson = jsonAdapterAdapter.fromJson(bufferedSource);
                Intrinsics.checkNotNull(objFromJson);
                List list = (List) objFromJson;
                Closeable.closeFinally(bufferedSource, null);
                return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiProvider$getEmojiGroups$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(CuratedListEmojiProvider.CallableC111461.call$lambda$1((EmojiGroup) obj));
                    }
                }));
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean call$lambda$1(EmojiGroup emojiGroup) {
            Intrinsics.checkNotNullParameter(emojiGroup, "<destruct>");
            return !emojiGroup.component2().isEmpty();
        }
    }

    public final Single<List<EmojiGroup>> getEmojiGroups() {
        Single<List<EmojiGroup>> singleSubscribeOn = Single.fromCallable(new CallableC111461()).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }
}
