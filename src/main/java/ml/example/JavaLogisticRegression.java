package ml.example;

import ml.*;
import scala.Some;

public class JavaLogisticRegression extends Estimator {

  private String _id;

  public JavaLogisticRegression(String id) {
    _id = id;
  }

  @Override
  public Model fit(Dataset dataset, ParamMap paramMap) {
    return null;
  }

  @Override
  public String id() {
    return _id;
  }

  private Param<Double> _alpha = new Param<>(this, "alpha", "regularization parameter", new Some<>(0.1));
  public Param<Double> alpha() { return _alpha; }

  public static class Model extends Transformer {

    private String _id;

    public Model(String id) {
      _id = id;
    }

    @Override
    public Dataset transform(Dataset dataset, ParamMap paramMap) {
      return null;
    }

    @Override
    public String id() {
      return _id;
    }
  }
}
