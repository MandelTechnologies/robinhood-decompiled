package com.robinhood.staticcontent.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.renderer.text.TextContentRenderer;

/* compiled from: StaticContentDataModule_Companion_ProvideMarkdownTextContentRendererFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/staticcontent/api/StaticContentDataModule_Companion_ProvideMarkdownTextContentRendererFactory;", "Ldagger/internal/Factory;", "Lorg/commonmark/renderer/text/TextContentRenderer;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideMarkdownTextContentRenderer", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.staticcontent.api.StaticContentDataModule_Companion_ProvideMarkdownTextContentRendererFactory */
/* loaded from: classes12.dex */
public final class C41270x2d03519a implements Factory<TextContentRenderer> {
    public static final C41270x2d03519a INSTANCE = new C41270x2d03519a();

    private C41270x2d03519a() {
    }

    @Override // javax.inject.Provider
    public TextContentRenderer get() {
        return provideMarkdownTextContentRenderer();
    }

    @JvmStatic
    public static final C41270x2d03519a create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final TextContentRenderer provideMarkdownTextContentRenderer() {
        Object objCheckNotNull = Preconditions.checkNotNull(StaticContentDataModule.INSTANCE.provideMarkdownTextContentRenderer(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (TextContentRenderer) objCheckNotNull;
    }
}
