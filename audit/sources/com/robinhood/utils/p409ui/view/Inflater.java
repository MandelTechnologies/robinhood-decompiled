package com.robinhood.utils.p409ui.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.utils.extensions.ContextSystemServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Inflater.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\bJ\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/Inflater;", "V", "Landroid/view/View;", "", "inflate", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface Inflater<V extends View> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    V inflate(ViewGroup parent);

    /* compiled from: Inflater.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/Inflater$Companion;", "", "<init>", "()V", "include", "Lcom/robinhood/utils/ui/view/Inflater;", "V", "Landroid/view/View;", "includeResId", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <V extends View> Inflater<V> include(final int includeResId) {
            return new Inflater() { // from class: com.robinhood.utils.ui.view.Inflater$Companion$include$1
                @Override // com.robinhood.utils.p409ui.view.Inflater
                public final V inflate(ViewGroup parent) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    V v = (V) ContextSystemServices.getLayoutInflater(context).inflate(includeResId, parent, false);
                    Intrinsics.checkNotNull(v, "null cannot be cast to non-null type V of com.robinhood.utils.ui.view.Inflater.Companion.include");
                    return v;
                }
            };
        }
    }
}
