package com.github.jinatonic.confetti;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.github.jinatonic.confetti.confetto.Confetto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/* loaded from: classes16.dex */
public class ConfettiManager {
    private float accelerationDeviationX;
    private float accelerationDeviationY;
    private float accelerationX;
    private float accelerationY;
    private ValueAnimator animator;
    private Rect bound;
    private final List<Confetto> confetti;
    private final ConfettiSource confettiSource;
    private final ConfettiView confettiView;
    private final ConfettoGenerator confettoGenerator;
    private long emissionDuration;
    private float emissionRate;
    private float emissionRateInverse;
    private Interpolator fadeOutInterpolator;
    private int initialRotation;
    private int initialRotationDeviation;
    private long lastEmittedTimestamp;
    private int numInitialCount;
    private final ViewGroup parentView;
    private final Random random;
    private final Queue<Confetto> recycledConfetti;
    private float rotationalAcceleration;
    private float rotationalAccelerationDeviation;
    private float rotationalVelocity;
    private float rotationalVelocityDeviation;
    private Float targetRotationalVelocity;
    private Float targetRotationalVelocityDeviation;
    private Float targetVelocityX;
    private Float targetVelocityXDeviation;
    private Float targetVelocityY;
    private Float targetVelocityYDeviation;
    private long ttl;
    private float velocityDeviationX;
    private float velocityDeviationY;
    private float velocityX;
    private float velocityY;

    public ConfettiManager(Context context, ConfettoGenerator confettoGenerator, ConfettiSource confettiSource, ViewGroup viewGroup) {
        this(confettoGenerator, confettiSource, viewGroup, ConfettiView.newInstance(context));
    }

    public ConfettiManager(ConfettoGenerator confettoGenerator, ConfettiSource confettiSource, ViewGroup viewGroup, ConfettiView confettiView) {
        this.random = new Random();
        this.recycledConfetti = new LinkedList();
        ArrayList arrayList = new ArrayList(300);
        this.confetti = arrayList;
        this.confettoGenerator = confettoGenerator;
        this.confettiSource = confettiSource;
        this.parentView = viewGroup;
        this.confettiView = confettiView;
        confettiView.bind(arrayList);
        confettiView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.github.jinatonic.confetti.ConfettiManager.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ConfettiManager.this.terminate();
            }
        });
        this.ttl = -1L;
        this.bound = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
    }

    public ConfettiManager setEmissionDuration(long j) {
        this.emissionDuration = j;
        return this;
    }

    public ConfettiManager setEmissionRate(float f) {
        float f2 = f / 1000.0f;
        this.emissionRate = f2;
        this.emissionRateInverse = 1.0f / f2;
        return this;
    }

    public ConfettiManager setVelocityX(float f, float f2) {
        this.velocityX = f / 1000.0f;
        this.velocityDeviationX = f2 / 1000.0f;
        return this;
    }

    public ConfettiManager setVelocityY(float f, float f2) {
        this.velocityY = f / 1000.0f;
        this.velocityDeviationY = f2 / 1000.0f;
        return this;
    }

    public ConfettiManager setInitialRotation(int i, int i2) {
        this.initialRotation = i;
        this.initialRotationDeviation = i2;
        return this;
    }

    public ConfettiManager setRotationalVelocity(float f, float f2) {
        this.rotationalVelocity = f / 1000.0f;
        this.rotationalVelocityDeviation = f2 / 1000.0f;
        return this;
    }

    public ConfettiManager animate() {
        cleanupExistingAnimation();
        attachConfettiViewToParent();
        addNewConfetti(this.numInitialCount, 0L);
        startNewAnimation();
        return this;
    }

    public void terminate() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.confettiView.terminate();
    }

    private void cleanupExistingAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.lastEmittedTimestamp = 0L;
        Iterator<Confetto> it = this.confetti.iterator();
        while (it.hasNext()) {
            removeConfetto(it.next());
            it.remove();
        }
    }

    private void attachConfettiViewToParent() {
        ViewParent parent = this.confettiView.getParent();
        if (parent != null) {
            if (parent != this.parentView) {
                ((ViewGroup) parent).removeView(this.confettiView);
                this.parentView.addView(this.confettiView);
            }
        } else {
            this.parentView.addView(this.confettiView);
        }
        this.confettiView.reset();
    }

    private void addNewConfetti(int i, long j) {
        int i2 = 0;
        while (i2 < i) {
            Confetto confettoPoll = this.recycledConfetti.poll();
            if (confettoPoll == null) {
                confettoPoll = this.confettoGenerator.generateConfetto(this.random);
            }
            Confetto confetto = confettoPoll;
            confetto.reset();
            long j2 = j;
            configureConfetto(confetto, this.confettiSource, this.random, j2);
            confetto.prepare(this.bound);
            addConfetto(confetto);
            i2++;
            j = j2;
        }
    }

    private void startNewAnimation() {
        ValueAnimator duration = ValueAnimator.ofInt(0).setDuration(Long.MAX_VALUE);
        this.animator = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.jinatonic.confetti.ConfettiManager.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                ConfettiManager.this.processNewEmission(currentPlayTime);
                ConfettiManager.this.updateConfetti(currentPlayTime);
                if (ConfettiManager.this.confetti.size() != 0 || currentPlayTime < ConfettiManager.this.emissionDuration) {
                    ConfettiManager.this.confettiView.invalidate();
                } else {
                    ConfettiManager.this.terminate();
                }
            }
        });
        this.animator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNewEmission(long j) {
        if (j < this.emissionDuration) {
            if (this.lastEmittedTimestamp == 0) {
                this.lastEmittedTimestamp = j;
                return;
            }
            int iNextFloat = (int) (this.random.nextFloat() * this.emissionRate * (j - r0));
            if (iNextFloat > 0) {
                this.lastEmittedTimestamp = (long) (this.lastEmittedTimestamp + (this.emissionRateInverse * iNextFloat));
                addNewConfetti(iNextFloat, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConfetti(long j) {
        Iterator<Confetto> it = this.confetti.iterator();
        while (it.hasNext()) {
            Confetto next = it.next();
            if (!next.applyUpdate(j)) {
                it.remove();
                removeConfetto(next);
            }
        }
    }

    private void addConfetto(Confetto confetto) {
        this.confetti.add(confetto);
    }

    private void removeConfetto(Confetto confetto) {
        this.recycledConfetti.add(confetto);
    }

    protected void configureConfetto(Confetto confetto, ConfettiSource confettiSource, Random random, long j) {
        confetto.setInitialDelay(j);
        confetto.setInitialX(confettiSource.getInitialX(random.nextFloat()));
        confetto.setInitialY(confettiSource.getInitialY(random.nextFloat()));
        confetto.setInitialVelocityX(getVarianceAmount(this.velocityX, this.velocityDeviationX, random));
        confetto.setInitialVelocityY(getVarianceAmount(this.velocityY, this.velocityDeviationY, random));
        confetto.setAccelerationX(getVarianceAmount(this.accelerationX, this.accelerationDeviationX, random));
        confetto.setAccelerationY(getVarianceAmount(this.accelerationY, this.accelerationDeviationY, random));
        Float f = this.targetVelocityX;
        confetto.setTargetVelocityX(f == null ? null : Float.valueOf(getVarianceAmount(f.floatValue(), this.targetVelocityXDeviation.floatValue(), random)));
        Float f2 = this.targetVelocityY;
        confetto.setTargetVelocityY(f2 == null ? null : Float.valueOf(getVarianceAmount(f2.floatValue(), this.targetVelocityYDeviation.floatValue(), random)));
        confetto.setInitialRotation(getVarianceAmount(this.initialRotation, this.initialRotationDeviation, random));
        confetto.setInitialRotationalVelocity(getVarianceAmount(this.rotationalVelocity, this.rotationalVelocityDeviation, random));
        confetto.setRotationalAcceleration(getVarianceAmount(this.rotationalAcceleration, this.rotationalAccelerationDeviation, random));
        Float f3 = this.targetRotationalVelocity;
        confetto.setTargetRotationalVelocity(f3 != null ? Float.valueOf(getVarianceAmount(f3.floatValue(), this.targetRotationalVelocityDeviation.floatValue(), random)) : null);
        confetto.setTTL(this.ttl);
        confetto.setFadeOut(this.fadeOutInterpolator);
    }

    private float getVarianceAmount(float f, float f2, Random random) {
        return f + (f2 * ((random.nextFloat() * 2.0f) - 1.0f));
    }
}
