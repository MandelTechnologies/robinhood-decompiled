package com.robinhood.android.creditcard.p091ui.post.signup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/Screen;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "CONFIRMATION", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.Screen, reason: use source file name */
/* loaded from: classes2.dex */
public final class PostSignUpAddToWaitlistDuxo9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PostSignUpAddToWaitlistDuxo9[] $VALUES;
    public static final PostSignUpAddToWaitlistDuxo9 INTRO = new PostSignUpAddToWaitlistDuxo9("INTRO", 0);
    public static final PostSignUpAddToWaitlistDuxo9 CONFIRMATION = new PostSignUpAddToWaitlistDuxo9("CONFIRMATION", 1);

    private static final /* synthetic */ PostSignUpAddToWaitlistDuxo9[] $values() {
        return new PostSignUpAddToWaitlistDuxo9[]{INTRO, CONFIRMATION};
    }

    public static EnumEntries<PostSignUpAddToWaitlistDuxo9> getEntries() {
        return $ENTRIES;
    }

    private PostSignUpAddToWaitlistDuxo9(String str, int i) {
    }

    static {
        PostSignUpAddToWaitlistDuxo9[] postSignUpAddToWaitlistDuxo9Arr$values = $values();
        $VALUES = postSignUpAddToWaitlistDuxo9Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(postSignUpAddToWaitlistDuxo9Arr$values);
    }

    public static PostSignUpAddToWaitlistDuxo9 valueOf(String str) {
        return (PostSignUpAddToWaitlistDuxo9) Enum.valueOf(PostSignUpAddToWaitlistDuxo9.class, str);
    }

    public static PostSignUpAddToWaitlistDuxo9[] values() {
        return (PostSignUpAddToWaitlistDuxo9[]) $VALUES.clone();
    }
}
