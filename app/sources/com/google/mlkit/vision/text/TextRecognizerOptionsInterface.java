package com.google.mlkit.vision.text;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-mlkit-text-recognition-common@@19.1.0 */
/* loaded from: classes27.dex */
public interface TextRecognizerOptionsInterface {
    String getConfigLabel();

    Executor getExecutor();

    boolean getIsThickClient();

    String getLanguageHint();

    int getLoggingEventId();

    int getLoggingLanguageOption();

    String getLoggingLibraryName();

    String getLoggingLibraryNameForOptionalModule();

    String getModuleId();
}
