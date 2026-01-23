package com.robinhood.staticcontent.p403ui;

import android.app.Application;
import com.robinhood.android.markdown.BentoMarkwonPlugin;
import com.robinhood.android.markdown.RhMarkwonPlugin;
import com.robinhood.android.markdown.RhMediaDecoder;
import com.robinhood.android.markdown.elements.NoUnderlineLinkMarkwonPlugin;
import io.noties.markwon.Markwon;
import io.noties.markwon.SoftBreakAddsNewLinePlugin;
import io.noties.markwon.image.ImagesPlugin;
import io.noties.markwon.movement.MovementMethodPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: StaticContentUiModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/staticcontent/ui/StaticContentUiModule;", "", "<init>", "()V", "provideMarkwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "app", "Landroid/app/Application;", "provideMarkwon", "Lio/noties/markwon/Markwon;", "builder", "provideNoUnderlineMarkwon", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StaticContentUiModule {
    public static final StaticContentUiModule INSTANCE = new StaticContentUiModule();

    private StaticContentUiModule() {
    }

    public final Markwon.Builder provideMarkwonBuilder(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Markwon.Builder builderUsePlugin = Markwon.builder(app).usePlugin(MovementMethodPlugin.create(BetterLinkMovementMethod.getInstance())).usePlugin(ImagesPlugin.create(new ImagesPlugin.ImagesConfigure() { // from class: com.robinhood.staticcontent.ui.StaticContentUiModule.provideMarkwonBuilder.1
            @Override // io.noties.markwon.image.ImagesPlugin.ImagesConfigure
            public final void configureImages(ImagesPlugin it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.defaultMediaDecoder(RhMediaDecoder.INSTANCE);
            }
        })).usePlugin(SoftBreakAddsNewLinePlugin.create()).usePlugin(RhMarkwonPlugin.INSTANCE.create(app)).usePlugin(BentoMarkwonPlugin.INSTANCE.create());
        Intrinsics.checkNotNullExpressionValue(builderUsePlugin, "usePlugin(...)");
        return builderUsePlugin;
    }

    public final Markwon provideMarkwon(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Markwon markwonBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        return markwonBuild;
    }

    @NoUnderlineMarkwon
    public final Markwon provideNoUnderlineMarkwon(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Markwon markwonBuild = builder.usePlugin(new NoUnderlineLinkMarkwonPlugin()).build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        return markwonBuild;
    }
}
