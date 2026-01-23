package com.robinhood.android.doc.p109ui.splash;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocUploadSplashViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/splash/SplashErrorEvent;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATE_REQUIRED", "LOADING_REQUIREMENTS_FAILED", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.splash.SplashErrorEvent, reason: use source file name */
/* loaded from: classes7.dex */
public final class DocUploadSplashViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocUploadSplashViewState2[] $VALUES;
    public static final DocUploadSplashViewState2 UPDATE_REQUIRED = new DocUploadSplashViewState2("UPDATE_REQUIRED", 0);
    public static final DocUploadSplashViewState2 LOADING_REQUIREMENTS_FAILED = new DocUploadSplashViewState2("LOADING_REQUIREMENTS_FAILED", 1);

    private static final /* synthetic */ DocUploadSplashViewState2[] $values() {
        return new DocUploadSplashViewState2[]{UPDATE_REQUIRED, LOADING_REQUIREMENTS_FAILED};
    }

    public static EnumEntries<DocUploadSplashViewState2> getEntries() {
        return $ENTRIES;
    }

    private DocUploadSplashViewState2(String str, int i) {
    }

    static {
        DocUploadSplashViewState2[] docUploadSplashViewState2Arr$values = $values();
        $VALUES = docUploadSplashViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(docUploadSplashViewState2Arr$values);
    }

    public static DocUploadSplashViewState2 valueOf(String str) {
        return (DocUploadSplashViewState2) Enum.valueOf(DocUploadSplashViewState2.class, str);
    }

    public static DocUploadSplashViewState2[] values() {
        return (DocUploadSplashViewState2[]) $VALUES.clone();
    }
}
