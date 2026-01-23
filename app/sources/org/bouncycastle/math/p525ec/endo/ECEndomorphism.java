package org.bouncycastle.math.p525ec.endo;

import org.bouncycastle.math.p525ec.ECPointMap;

/* loaded from: classes25.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
