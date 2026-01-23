package com.robinhood.scarlet.transition;

import com.robinhood.scarlet.property.StyleProperty;
import kotlin.Metadata;

/* compiled from: StylePropertyTransition.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "T", "V", "", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "isOptIn", "", "()Z", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "getStyleProperty", "()Lcom/robinhood/scarlet/property/StyleProperty;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface StylePropertyTransition<T, V> extends ThemeTransition<T> {

    /* compiled from: StylePropertyTransition.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class DefaultImpls {
        public static <T, V> boolean isOptIn(StylePropertyTransition<? super T, V> stylePropertyTransition) {
            return false;
        }
    }

    StyleProperty<V> getStyleProperty();

    boolean isOptIn();
}
