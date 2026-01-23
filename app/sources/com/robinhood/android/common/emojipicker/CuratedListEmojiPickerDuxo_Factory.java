package com.robinhood.android.common.emojipicker;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListEmojiPickerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "emojiProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CuratedListEmojiPickerDuxo_Factory implements Factory<CuratedListEmojiPickerDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CuratedListEmojiProvider> emojiProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CuratedListEmojiPickerDuxo_Factory create(Provider<CuratedListEmojiProvider> provider, Provider<DuxoBundle> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final CuratedListEmojiPickerDuxo newInstance(CuratedListEmojiProvider curatedListEmojiProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(curatedListEmojiProvider, duxoBundle);
    }

    public CuratedListEmojiPickerDuxo_Factory(Provider<CuratedListEmojiProvider> emojiProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(emojiProvider, "emojiProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.emojiProvider = emojiProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CuratedListEmojiPickerDuxo get() {
        Companion companion = INSTANCE;
        CuratedListEmojiProvider curatedListEmojiProvider = this.emojiProvider.get();
        Intrinsics.checkNotNullExpressionValue(curatedListEmojiProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(curatedListEmojiProvider, duxoBundle);
    }

    /* compiled from: CuratedListEmojiPickerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo_Factory;", "emojiProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CuratedListEmojiPickerDuxo_Factory create(Provider<CuratedListEmojiProvider> emojiProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(emojiProvider, "emojiProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CuratedListEmojiPickerDuxo_Factory(emojiProvider, duxoBundle);
        }

        @JvmStatic
        public final CuratedListEmojiPickerDuxo newInstance(CuratedListEmojiProvider emojiProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(emojiProvider, "emojiProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CuratedListEmojiPickerDuxo(emojiProvider, duxoBundle);
        }
    }
}
