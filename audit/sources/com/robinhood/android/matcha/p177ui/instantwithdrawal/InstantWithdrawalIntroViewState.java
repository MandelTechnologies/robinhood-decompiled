package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantWithdrawalIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Error;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loading;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface InstantWithdrawalIntroViewState {

    /* compiled from: InstantWithdrawalIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loading;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements InstantWithdrawalIntroViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: InstantWithdrawalIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Error;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements InstantWithdrawalIntroViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: InstantWithdrawalIntroViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "title", "", "disclosureContent", "", "bullets", "", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loaded$Bullet;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDisclosureContent", "()Ljava/lang/CharSequence;", "getBullets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Bullet", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements InstantWithdrawalIntroViewState {
        public static final int $stable = 8;
        private final List<Bullet> bullets;
        private final CharSequence disclosureContent;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, CharSequence charSequence, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                charSequence = loaded.disclosureContent;
            }
            if ((i & 4) != 0) {
                list = loaded.bullets;
            }
            return loaded.copy(str, charSequence, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getDisclosureContent() {
            return this.disclosureContent;
        }

        public final List<Bullet> component3() {
            return this.bullets;
        }

        public final Loaded copy(String title, CharSequence disclosureContent, List<Bullet> bullets) {
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            return new Loaded(title, disclosureContent, bullets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.disclosureContent, loaded.disclosureContent) && Intrinsics.areEqual(this.bullets, loaded.bullets);
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CharSequence charSequence = this.disclosureContent;
            return ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.bullets.hashCode();
        }

        public String toString() {
            String str = this.title;
            CharSequence charSequence = this.disclosureContent;
            return "Loaded(title=" + str + ", disclosureContent=" + ((Object) charSequence) + ", bullets=" + this.bullets + ")";
        }

        public Loaded(String str, CharSequence charSequence, List<Bullet> bullets) {
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            this.title = str;
            this.disclosureContent = charSequence;
            this.bullets = bullets;
        }

        public final String getTitle() {
            return this.title;
        }

        public final CharSequence getDisclosureContent() {
            return this.disclosureContent;
        }

        public final List<Bullet> getBullets() {
            return this.bullets;
        }

        /* compiled from: InstantWithdrawalIntroViewState.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState$Loaded$Bullet;", "", "title", "", CarResultComposable2.BODY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Bullet {
            public static final int $stable = 0;
            private final String body;
            private final String title;

            public static /* synthetic */ Bullet copy$default(Bullet bullet, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bullet.title;
                }
                if ((i & 2) != 0) {
                    str2 = bullet.body;
                }
                return bullet.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            public final Bullet copy(String title, String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                return new Bullet(title, body);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bullet)) {
                    return false;
                }
                Bullet bullet = (Bullet) other;
                return Intrinsics.areEqual(this.title, bullet.title) && Intrinsics.areEqual(this.body, bullet.body);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.body.hashCode();
            }

            public String toString() {
                return "Bullet(title=" + this.title + ", body=" + this.body + ")";
            }

            public Bullet(String title, String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                this.title = title;
                this.body = body;
            }

            public final String getBody() {
                return this.body;
            }

            public final String getTitle() {
                return this.title;
            }
        }
    }
}
