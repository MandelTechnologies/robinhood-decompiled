package com.stripe.android.core.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.time.Duration;

/* compiled from: DurationProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/core/utils/DurationProvider;", "", "end", "Lkotlin/time/Duration;", "key", "Lcom/stripe/android/core/utils/DurationProvider$Key;", "end-LV8wdWc", "start", "", "reset", "", "Key", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface DurationProvider {
    /* renamed from: end-LV8wdWc */
    Duration mo26848endLV8wdWc(Key key);

    void start(Key key, boolean reset);

    /* compiled from: DurationProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void start$default(DurationProvider durationProvider, Key key, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            durationProvider.start(key, z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DurationProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/core/utils/DurationProvider$Key;", "", "(Ljava/lang/String;I)V", "Loading", "Checkout", "LinkSignup", "ConfirmButtonClicked", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Key {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Key[] $VALUES;
        public static final Key Loading = new Key("Loading", 0);
        public static final Key Checkout = new Key("Checkout", 1);
        public static final Key LinkSignup = new Key("LinkSignup", 2);
        public static final Key ConfirmButtonClicked = new Key("ConfirmButtonClicked", 3);

        private static final /* synthetic */ Key[] $values() {
            return new Key[]{Loading, Checkout, LinkSignup, ConfirmButtonClicked};
        }

        public static EnumEntries<Key> getEntries() {
            return $ENTRIES;
        }

        public static Key valueOf(String str) {
            return (Key) Enum.valueOf(Key.class, str);
        }

        public static Key[] values() {
            return (Key[]) $VALUES.clone();
        }

        private Key(String str, int i) {
        }

        static {
            Key[] keyArr$values = $values();
            $VALUES = keyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(keyArr$values);
        }
    }
}
